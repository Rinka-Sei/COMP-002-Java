/**
 * This class determines if a user-provided integer is even or odd.
 * This improved version separates the logic for checking the number into a separate method
 * for better testability and uses a ternary operator for more concise code.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The EvenOrOdd_improved class prompts the user to enter an integer and determines if it is even or odd.
 * The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class EvenOrOdd_improved {

    /**
     * Determines if the provided number is even or odd.
     *
     * @param number The number to be checked.
     * @return A string indicating whether the number is even or odd.
     */
    public String checkEvenOrOdd(int number) {
        return (number % 2 == 0) ? "**Even**" : "**Odd**";
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the checkEvenOrOdd method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input an integer: ");
            int number = scanner.nextInt();
            EvenOrOdd_improved checker = new EvenOrOdd_improved();
            String result = checker.checkEvenOrOdd(number);
            System.out.println(number + " is an " + result + " number.");
        }
    }
}
