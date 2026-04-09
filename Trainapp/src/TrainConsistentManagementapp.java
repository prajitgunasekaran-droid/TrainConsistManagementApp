import java.util.LinkedHashSet;

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 🔹 Add bogies (insertion order maintained)
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 🔹 Attempt to add duplicate
        train.add("Sleeper"); // duplicate → ignored

        System.out.println("\nTrain Formation (Insertion Order Preserved):");

        // 🔹 Display formation
        for (String bogie : train) {
            System.out.println(bogie);
        }

        // 🔹 Final state
        System.out.println("\nFinal Train Formation: " + train);

        // 🔹 Continue program
        System.out.println("\nProgram continues...");
    }
}