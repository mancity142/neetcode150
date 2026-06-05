import java.util.Scanner; // Import the Scanner class to read user input

public class NumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read data from the console
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Welcome to the Number Checker ---");
        System.out.print("Please enter an integer: ");
        
        // Read an integer provided by the user
        int number = scanner.nextInt();
        
        // Check if the number is divisible by 2
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }
        
        System.out.println("\nCounting down from your number to 1:");
        // A simple loop demonstrating countdown logic
        for (int i = number; i > 0; i--) {
            System.out.print(i + " ");
        }
        
        // Always close your scanner to prevent resource leaks
        scanner.close();
        System.out.println("\nProgram finished successfully.");
    }
}
