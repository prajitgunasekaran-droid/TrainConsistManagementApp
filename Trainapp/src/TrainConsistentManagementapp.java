import java.util.ArrayList;
import java.util.List;

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Dynamic Initialization using ArrayList
        List<String> bogies = new ArrayList<>();

        // 🔹 Display Initial Bogie Count
        System.out.println("Initializing train consist...");
        System.out.println("Initial bogie count: " + bogies.size());

        // 🔹 Continue Program
        System.out.println("Program continues...");
    }
}