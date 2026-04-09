import java.util.*;

// -------------------------------
// Custom Exception Class
// -------------------------------
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// -------------------------------
// Passenger Bogie Class
// -------------------------------
class PassengerBogie {
    private String type;
    private int capacity;

    // Constructor with validation (Fail-Fast)
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Capacity: " + capacity;
    }
}

// -------------------------------
// Main Application Class
// -------------------------------
class BogieValidationApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogieList = new ArrayList<>();

        // Test different cases
        try {
            // ✅ Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC", 64);

            bogieList.add(b1);
            bogieList.add(b2);

            // ❌ Invalid bogie (negative capacity)
            PassengerBogie b3 = new PassengerBogie("General", -10);
            bogieList.add(b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }

        // Display valid bogies created
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie bogie : bogieList) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues safely...");
    }
}