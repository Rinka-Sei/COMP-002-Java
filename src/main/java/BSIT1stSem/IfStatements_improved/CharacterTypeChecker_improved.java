/**
 * This class determines if a user-provided character is an alphabet, a number, or a special character.
 * This improved version separates the logic for checking the character type into a separate method
 * for better testability and adherence to the single responsibility principle.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The CharacterTypeChecker_improved class prompts the user to enter a single character and determines its type.
 * The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class CharacterTypeChecker_improved {

    /**
     * Determines the type of the provided character.
     *
     * @param ch The character to be checked.
     * @return A string indicating whether the character is an alphabet, a number, or a special character.
     */
    public String getCharacterType(char ch) {
        if (Character.isLetter(ch)) {
            return "**Alphabet**";
        } else if (Character.isDigit(ch)) {
            return "**Number**";
        } else {
            return "**Special Character**";
        }
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getCharacterType method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a single character: ");
            char ch = scanner.next().charAt(0);
            CharacterTypeChecker_improved checker = new CharacterTypeChecker_improved();
            String type = checker.getCharacterType(ch);
            System.out.println("The character is a(n) " + type + ".");
        }
    }
}
