/**
 * This class checks if a user-provided character is an uppercase or lowercase letter.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The CaseChecker class is a simple Java program that prompts the user to enter a single character.
 * It then determines whether the character is an uppercase letter, a lowercase letter, or not a letter
 * at all. The result is printed to the console. This class demonstrates nested if-else statements
 * and character manipulation.
 *
 * @author Jules
 * @version 1.0
 */
public class CaseChecker {

    /**
     * The main entry point of the program.
     * It takes a single character as input from the user and checks its case.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a character: ");
            char ch = scanner.next().charAt(0);

            // We first check if it is a letter before checking case
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    System.out.println(ch + " is an **Uppercase Letter**.");
                } else {
                    // Must be lowercase if it's a letter and not uppercase
                    System.out.println(ch + " is a **Lowercase Letter**.");
                }
            } else {
                System.out.println(ch + " is not an alphabet.");
            }
        }
    }
}
