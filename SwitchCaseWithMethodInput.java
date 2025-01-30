import java.util.Scanner;

public class SwitchCaseWithMethodInput {

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
        System.out.println("Method Two called. Enter two numbers to add:");
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));
    }

    public static void methodThree(Scanner scanner) {
        System.out.println("Method Three called. Enter a string to reverse:");
        scanner.nextLine(); // Consume the leftover newline
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
