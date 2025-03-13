import java.util.Scanner; // Import Scanner for user input

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to take inputs

        System.out.print("Enter your name: "); // Ask user to input their name.
        String name = scanner.nextLine(); // Read the input

        System.out.print("Enter your age: "); // Ask user to input their age.
        int age = scanner.nextInt(); // Read the input.

        String s; // Declare a string here, without initializing it.
        if (age > 18) {
            s = "Adult";
        } else {
            s = "Child";
        }
        System.out.println("Hello, " + name + "! You are a " + s + "!");

        // Close the scanner
        scanner.close();
    }
}
