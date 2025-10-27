/**
 * This class finds the largest among three numbers provided by the user.
 * This improved version separates the logic for finding the largest number into a separate method
 * for better testability and uses the Math.max function for a more concise and readable implementation.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The LargestAmongThree_improved class prompts the user to enter three numbers and finds the largest.
 * The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class LargestAmongThree_improved {

    /**
     * Finds the largest of the three provided numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @param num3 The third number.
     * @return The largest of the three numbers.
     */
    public double findLargest(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the findLargest method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Input the second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Input the third number: ");
            double num3 = scanner.nextDouble();

            LargestAmongThree_improved finder = new LargestAmongThree_improved();
            double largest = finder.findLargest(num1, num2, num3);

            System.out.println("The largest number is: " + largest);
        }
    }
}
