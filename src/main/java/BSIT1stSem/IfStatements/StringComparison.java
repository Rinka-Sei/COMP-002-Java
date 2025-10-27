/**
 * This class compares two user-provided strings to check if they are equal.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The StringComparison class is a simple Java program that prompts the user to enter two strings.
 * It then compares the content of the two strings to determine if they are equal.
 * The result of the comparison is printed to the console. This class highlights the correct
 * way to compare strings in Java using the .equals() method.
 *
 * @author Jules
 * @version 1.0
 */
public class StringComparison {

    /**
     * The main entry point of the program.
     * It takes two strings as input from the user and compares them.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the first string: ");
            String str1 = scanner.nextLine();
            System.out.print("Input the second string: ");
            String str2 = scanner.nextLine();

            // Use .equals() for proper String content comparison
            if (str1.equals(str2)) {
                System.out.println("The two strings are **equal**.");
            } else {
                System.out.println("The two strings are **not equal**.");
            }
        }
    }
}
