/**
 * This class determines if a user-provided character is a vowel or a consonant.
 */
package BSIT1stSem.Seatworks;

import java.util.Scanner;

/**
 * The VowelOrConsonant class prompts the user to enter a single character. It then
 * determines if the character is a vowel or a consonant. The program first verifies
 * that the input is a letter before performing the check.
 *
 * @author Jules
 * @version 1.0
 */
public class VowelOrConsonant {

    /**
     * The main entry point of the program.
     * It takes a single character as input and checks if it is a vowel or a consonant.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char input = scanner.next().charAt(0);

        if (Character.isLetter(input)) {
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'
                    || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Please enter a letter.");
        }
    }
}
