/**
 * This class performs basic arithmetic operations (addition, subtraction, multiplication, and division)
 * on two user-provided integers.
 */
package BSIT1stSem.Seatworks;

import java.util.*;

/**
 * The ArithmeticCalculator class is a simple Java program that takes two integers as input
 * from the user and calculates their sum, difference, product, and quotient. The class
 * is structured with separate methods for each arithmetic operation to promote modularity.
 *
 * @author Jules
 * @version 1.0
 */
public class ArithmeticCalculator {

    /**
     * The Scanner object used to read user input.
     */
    private Scanner sc;

    /**
     * The main entry point of the program.
     * It creates an instance of the ArithmeticCalculator class, gets input from the user,
     * performs the calculations, and prints the results.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        ArithmeticCalculator calculate = new ArithmeticCalculator();
        int[] inputs = calculate.input();
        int num1 = inputs[0];
        int num2 = inputs[1];

        // output
        System.out.println("Sum of " + num1 + " and " + num2 + " is:" + calculate.add(num1, num2));
        System.out.println("Difference of " + num1 + " and " + num2 + " is:" + calculate.subtract(num1, num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is:" + calculate.multiply(num1, num2));
        System.out.println("Quotient of " + num1 + " and " + num2 + " is:" + calculate.divide(num1, num2));
        calculate.sc.close();
    }

    /**
     * Adds two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The difference between the two integers.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of the two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param a The first integer (dividend).
     * @param b The second integer (divisor).
     * @return The quotient of the two integers.
     */
    public int divide(int a, int b) {
        return a / b;
    }

    /**
     * Prompts the user to enter two integers and returns them as an array.
     *
     * @return An array containing the two integers entered by the user.
     */
    public int[] input() {
        this.sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b = sc.nextInt();
        return new int[]{a, b};
    }
}
