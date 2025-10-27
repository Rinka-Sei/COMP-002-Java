/**
 * This class determines if a user-provided character is a vowel or a consonant.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The VowelOrConsonant class prompts the user to enter a single character. It then
 * determines if the character is a vowel or a consonant. The input is case-insensitive,
 * and the program first verifies that the input is a letter before performing the check.
 * This class demonstrates a switch statement with multiple case labels.
 *
 * @author Jules
 * @version 1.0
 */
public class VowelOrConsonant {

    /**
     * The main entry point of the program.
     * It takes a single character as input, converts it to lowercase, and checks if it is a letter.
     * If it is a letter, a switch statement is used to determine if it is a vowel or a consonant.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a single character: ");
            char ch = Character.toLowerCase(scanner.next().charAt(0)); // Convert to lowercase

            if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' ->
                        System.out.println(ch + " is a **Vowel**.");
                    default ->
                        System.out.println(ch + " is a **Consonant**.");
                }
            } else {
                System.out.println("Input is not a letter.");
            }
        }
    }
}
