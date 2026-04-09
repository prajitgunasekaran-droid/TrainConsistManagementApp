import java.util.ArrayList;

class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Using ArrayList directly
        ArrayList<String> bogies = new ArrayList<>();

        // 🔹 Adding bogies (Create)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("\nBogies after adding:");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.println((i + 1) + ". " + bogies.get(i));
        }

        // 🔹 Remove bogie using index (Delete)
        bogies.remove(1); // removes "AC Chair"

        System.out.println("\nAfter removing 2nd bogie:");
        for (String b : bogies) {
            System.out.println(b);
        }

        // 🔹 Check existence manually (without contains)
        boolean found = false;
        for (String b : bogies) {
            if (b.equals("Sleeper")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nSleeper bogie is present.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // 🔹 Final State
        System.out.println("\nFinal Bogie List: " + bogies);

        System.out.println("\nProgram continues...");
    }
}