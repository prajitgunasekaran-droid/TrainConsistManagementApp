import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TrainApp {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        Scanner scanner = new Scanner(System.in);

        // 🔹 Input from user
        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // 🔹 Regex Patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // 🔹 Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // 🔹 Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // 🔹 Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // 🔹 Output results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        // 🔹 Continue program
        System.out.println("\nProgram continues...");

        scanner.close();
    }
}