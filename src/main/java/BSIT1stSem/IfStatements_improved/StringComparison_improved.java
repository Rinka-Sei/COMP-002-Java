/**
 * This class compares two user-provided strings to check if they are equal.
 * This improved version separates the logic for comparing the strings into a separate method
 * for better testability and adherence to the single responsibility principle.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The StringComparison_improved class prompts the user to enter two strings and compares them.
 * The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class StringComparison_improved {

    /**
     * Compares two strings for equality.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return true if the strings are equal, false otherwise.
     */
    public boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the areStringsEqual method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the first string: ");
            String str1 = scanner.nextLine();
            System.out.print("Input the second string: ");
            String str2 = scanner.nextLine();
            StringComparison_improved comparator = new StringComparison_improved();

            if (comparator.areStringsEqual(str1, str2)) {
                System.out.println("The two strings are **equal**.");
            } else {
                System.out.println("The two strings are **not equal**.");
            }
        }
    }
}
