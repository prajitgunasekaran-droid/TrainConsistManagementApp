import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Reuse Bogie List (from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury Coach", 80));

        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // 🔹 Stream Filtering (capacity > 60)
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 🔹 Display Filtered Result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);

        // 🔹 Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (unchanged):");
        bogies.forEach(System.out::println);

        // 🔹 Continue program
        System.out.println("\nProgram continues...");
    }
}