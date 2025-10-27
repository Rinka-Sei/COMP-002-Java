/**
 * This class calculates the average of five numbers provided by the user.
 */
package BSIT1stSem;

import java.util.*;

/**
 * The Average_calculator class is a simple Java program that prompts the user to enter
 * five numbers. It then calculates and displays the average of these numbers.
 * This class serves as a basic example of handling user input and performing
 * simple arithmetic operations in Java.
 *
 * @author Jules
 * @version 1.0
 */
public class Average_calculator {

    /**
     * The main entry point of the program.
     * It takes five numbers as input from the user, calculates the average,
     * and prints the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // average of 5 numbers
        try (Scanner scan = new Scanner(System.in)) {
            double num1, num2, num3, num4, num5, average;
            //
            System.out.print("Enter Number 1: ");
            num1 = scan.nextDouble();
            System.out.print("Enter Number 2: ");
            num2 = scan.nextDouble();
            System.out.print("Enter Number 3: ");
            num3 = scan.nextDouble();
            System.out.print("Enter Number 4: ");
            num4 = scan.nextDouble();
            System.out.print("Enter Number 5: ");
            num5 = scan.nextDouble();
            // Use PEMDAS Rule
            average = (num1 + num2 + num3 + num4 + num5) / 5;    //average = sum / 5;
            System.out.println("Your average is : " + average);
        }
    }
}
