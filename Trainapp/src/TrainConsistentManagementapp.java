import java.util.*;

// -------------------------------
// Custom Runtime Exception
// -------------------------------
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// -------------------------------
// Goods Bogie Class
// -------------------------------
class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    // Cargo assignment with safety handling
    public void assignCargo(String cargo) {
        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for " + shape + " bogie.\n");
        }
    }

    @Override
    public String toString() {
        return "Shape: " + shape + ", Cargo: " + (cargo == null ? "None" : cargo);
    }
}

// -------------------------------
// Main Application Class
// -------------------------------
class CargoAssignmentApp {

    public static void main(String[] args) {

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe Assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe Assignment (Handled)
        b2.assignCargo("Petroleum");

        // ✅ Continue program execution
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}