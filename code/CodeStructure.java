// 1. Package Declaration (For organizing files in large codebases)
package codestructure;

// 2. Import Statements (For external libraries/classes)
import java.util.Scanner;

// 3. Class Declaration (Java is object-oriented, so everything is inside a class)
public class CodeStructure {

    // 4. Main Method (Entry point for execution)
    public static void main(String[] args) {
        // 5. Variable Declaration
        String message = "Welcome to Java!";
        int year = 2025;

        System.out.println(message);
        System.out.println("The current year is " + year + ".");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // call our method
        greetUser(name);

        scanner.close();
    }

    // 6. Custom Method (Where we implement program logic)
    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Nice to meet you.");
    }
}
