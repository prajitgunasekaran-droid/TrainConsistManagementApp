import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create Bogie List (reuse from previous UCs)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury Coach", 80));

        System.out.println("\nBogie List:");
        bogies.forEach(System.out::println);

        // 🔹 Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // aggregate sum

        // 🔹 Display total
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // 🔹 Continue program
        System.out.println("\nProgram continues...");
    }
}