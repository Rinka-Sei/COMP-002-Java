/**
 * This class checks if a user-provided number is positive, negative, or zero.
 * This improved version separates the logic for checking the number's sign into a separate method
 * for better testability and adherence to the single responsibility principle.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The NumberSignChecker_improved class prompts the user to enter a number and determines its sign.
 * The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class NumberSignChecker_improved {

    /**
     * Determines the sign of the provided number.
     *
     * @param number The number to be checked.
     * @return A string indicating whether the number is positive, negative, or zero.
     */
    public String checkSign(double number) {
        if (number > 0) {
            return "**Positive**";
        } else if (number < 0) {
            return "**Negative**";
        } else {
            return "**Zero**";
        }
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the checkSign method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            double number = scanner.nextDouble();
            NumberSignChecker_improved checker = new NumberSignChecker_improved();
            String result = checker.checkSign(number);
            System.out.println("The number is " + result + ".");
        }
    }
}
