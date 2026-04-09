import java.util.HashSet;
import java.util.Set;

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // 🔹 Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("\nBogie IDs after insertion (duplicates ignored):");

        // 🔹 Display unique bogie IDs
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // 🔹 Final Set Display
        System.out.println("\nFinal Unique Bogie Set: " + bogieIds);

        // 🔹 Continue Program
        System.out.println("\nProgram continues...");
    }
}