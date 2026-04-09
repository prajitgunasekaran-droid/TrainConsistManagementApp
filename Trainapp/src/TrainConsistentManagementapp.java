import java.util.LinkedList;

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // 🔹 Add bogies (initial formation)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // 🔹 Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // 🔹 Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // 🔹 Final ordered consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }

        // 🔹 Continue program
        System.out.println("\nProgram continues...");
    }
}