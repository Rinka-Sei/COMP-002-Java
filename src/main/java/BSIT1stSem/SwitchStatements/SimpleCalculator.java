/**
 * This class implements a simple calculator that performs basic arithmetic operations.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The SimpleCalculator class allows a user to input two numbers and an operator (+, -, *, /).
 * It then performs the specified calculation and displays the result. This class demonstrates
 * how a switch statement can be used to handle different operations based on a character input.
 *
 * @author Jules
 * @version 1.0
 */
public class SimpleCalculator {

    /**
     * The main entry point of the program.
     * It prompts the user for two numbers and an operator, then uses a switch statement
     * to perform the calculation. It includes error handling for invalid operators and
     * division by zero.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Input operator (+, -, *, /): ");
            // Read the first character of the input
            char operator = scanner.next().charAt(0);

            System.out.print("Input second number: ");
            double num2 = scanner.nextDouble();
            double result;

            // Using Enhanced Switch (->{})
            switch (operator) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default ->
                    System.out.println("Error: Invalid operator!");
            }
        }
    }
}
