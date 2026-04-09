import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

class SafetyComplianceApp {
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain")
        );

        // Step 2: Convert to stream and validate using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(bogie ->
                        // Conditional rule:
                        // If Cylindrical → only Petroleum allowed
                        !bogie.getType().equalsIgnoreCase("Cylindrical") ||
                                bogie.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}