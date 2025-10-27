/**
 * This class finds the largest among three numbers provided by the user.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The LargestAmongThree class is a simple Java program that prompts the user to enter three numbers.
 * It then compares the numbers to find the largest one and prints the result to the console.
 * This class demonstrates the use of if-else-if statements for comparison.
 *
 * @author Jules
 * @version 1.0
 */
public class LargestAmongThree {

    /**
     * The main entry point of the program.
     * It takes three numbers as input from the user and determines which is the largest.
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

            double largest;

            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);
        }
    }
}
