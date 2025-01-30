import java.util.ArrayList;
import java.util.Scanner;

public class SwitchCaseWithArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        // Switch-case to call the respective method
        switch (choice) {
            case 1:
                methodOne(scanner);
                break;
            case 2:
                methodTwo(scanner);
                break;
            case 3:
                methodThree(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        scanner.close(); // Close the scanner to release resources
    }

    public static void methodOne(Scanner scanner) {
        System.out.println("Method One called. Enter a number to double it:");
        int number = scanner.nextInt();
        System.out.println("Doubled value: " + (number * 2));
    }

    public static void methodTwo(Scanner scanner) {
        System.out.println("Method Two called. Enter names to store in a list.");
        ArrayList<String> names = new ArrayList<>();

        String choice;
        do {
            System.out.print("Enter a name: ");
            String name = scanner.next();
            names.add(name); // Add name to the list

            System.out.print("Do you want to add another name? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Names stored in the list:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void methodThree(Scanner scanner) {
        System.out.println("Method Three called. Enter a string to reverse:");
        scanner.nextLine(); // Consume the leftover newline
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
