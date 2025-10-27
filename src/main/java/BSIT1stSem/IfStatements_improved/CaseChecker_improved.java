/**
 * This class checks if a user-provided character is an uppercase or lowercase letter.
 * This improved version separates the logic for checking the character case into a separate method
 * for better testability and adherence to the single responsibility principle.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The CaseChecker_improved class prompts the user to enter a single character and determines
 * its case. The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class CaseChecker_improved {

    /**
     * Determines the case of the provided character.
     *
     * @param ch The character to be checked.
     * @return A string indicating whether the character is an uppercase letter, a lowercase letter,
     *         or not an alphabet.
     */
    public String checkCase(char ch) {
        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                return ch + " is an **Uppercase Letter**.";
            } else {
                return ch + " is a **Lowercase Letter**.";
            }
        } else {
            return ch + " is not an alphabet.";
        }
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the checkCase method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a character: ");
            char ch = scanner.next().charAt(0);
            CaseChecker_improved caseChecker = new CaseChecker_improved();
            String result = caseChecker.checkCase(ch);
            System.out.println(result);
        }
    }
}
