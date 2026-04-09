import java.util.HashMap;
import java.util.Map;
class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create HashMap for bogie → capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // 🔹 Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // 🔹 Display all bogies with capacity
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // 🔹 Example lookup
        String search = "Sleeper";
        System.out.println("\nCapacity of " + search + ": " + bogieCapacity.get(search));

        // 🔹 Continue program
        System.out.println("\nProgram continues...");
    }
}