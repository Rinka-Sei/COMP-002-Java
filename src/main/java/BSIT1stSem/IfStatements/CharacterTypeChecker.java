/**
 * This class determines if a user-provided character is an alphabet, a number, or a special character.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The CharacterTypeChecker class is a simple Java program that prompts the user to enter a single character.
 * It then determines whether the character is a letter, a digit, or a special character.
 * The result is printed to the console. This class demonstrates the use of if-else-if statements
 * and character manipulation methods.
 *
 * @author Jules
 * @version 1.0
 */
public class CharacterTypeChecker {

    /**
     * The main entry point of the program.
     * It takes a single character as input from the user and checks its type.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a single character: ");
            char ch = scanner.next().charAt(0);
            String type;

            if (Character.isLetter(ch)) {
                type = "**Alphabet**";
            } else if (Character.isDigit(ch)) {
                type = "**Number**";
            } else {
                type = "**Special Character**";
            }

            System.out.println("The character is a(n) " + type + ".");
        }
    }
}
