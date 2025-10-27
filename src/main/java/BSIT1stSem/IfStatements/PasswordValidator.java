/**
 * This class validates a user-provided password against a correct password.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The PasswordValidator class is a simple Java program that prompts the user to enter a password.
 * It then checks if the entered password matches a predefined correct password.
 * The result of the validation (Access Granted or Access Denied) is printed to the console.
 * This class is a basic example of string comparison and conditional logic.
 *
 * @author Jules
 * @version 1.0
 */
public class PasswordValidator {

    /**
     * The main entry point of the program.
     * It takes a password as input from the user and validates it.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final String CORRECT_PASSWORD = "admin123";

            System.out.print("Input password: ");
            String password = scanner.nextLine();

            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("**Access Granted**");
            } else {
                System.out.println("**Access Denied**");
            }
        }
    }
}
