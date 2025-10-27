/**
 * This class validates a user-provided password against a correct password.
 * This improved version separates the logic for validating the password into a separate method
 * for better testability and adherence to the single responsibility principle.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The PasswordValidator_improved class prompts the user to enter a password and validates it
 * against a predefined correct password. The core logic is encapsulated in a separate,
 * easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class PasswordValidator_improved {

    /**
     * The correct password.
     */
    private static final String CORRECT_PASSWORD = "admin123";

    /**
     * Validates the provided password.
     *
     * @param password The password to be validated.
     * @return true if the password is correct, false otherwise.
     */
    public boolean isPasswordCorrect(String password) {
        return CORRECT_PASSWORD.equals(password);
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the isPasswordCorrect method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input password: ");
            String password = scanner.nextLine();
            PasswordValidator_improved validator = new PasswordValidator_improved();

            if (validator.isPasswordCorrect(password)) {
                System.out.println("**Access Granted**");
            } else {
                System.out.println("**Access Denied**");
            }
        }
    }
}
