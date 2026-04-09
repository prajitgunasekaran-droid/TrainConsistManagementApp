import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString for display
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Sort using Comparator (ascending by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Descending order (optional)
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nAfter Sorting (Descending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Continue program
        System.out.println("\nProgram continues...");
    }
}