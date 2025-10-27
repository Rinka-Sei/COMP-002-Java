/**
 * This class determines if a user-provided character is a vowel or a consonant.
 * This improved version separates the logic for checking the character into a separate method
 * for better testability and uses a Set for more efficient vowel checking.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Scanner;
import java.util.Set;

/**
 * The VowelOrConsonant_improved class prompts the user to enter a single character and
 * determines if it is a vowel or a consonant. The core logic is encapsulated in a
 * separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class VowelOrConsonant_improved {

    /**
     * A set containing all lowercase vowels.
     */
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    /**
     * Checks if the provided character is a vowel or a consonant.
     *
     * @param ch The character to be checked.
     * @return A string indicating whether the character is a vowel, a consonant, or not a letter.
     */
    public String checkVowelOrConsonant(char ch) {
        if (!Character.isLetter(ch)) {
            return "Input is not a letter.";
        }
        return VOWELS.contains(Character.toLowerCase(ch)) ? "**Vowel**" : "**Consonant**";
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the checkVowelOrConsonant method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a single character: ");
            char ch = scanner.next().charAt(0);
            VowelOrConsonant_improved checker = new VowelOrConsonant_improved();
            String result = checker.checkVowelOrConsonant(ch);
            System.out.println(ch + " is a " + result + ".");
        }
    }
}
