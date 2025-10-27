/**
 * This class implements a simple calculator that performs basic arithmetic operations.
 * This improved version separates the calculation logic into a separate method for better
 * testability and uses an Optional to handle the possibility of division by zero.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Optional;
import java.util.Scanner;

/**
 * The SimpleCalculator_improved class allows a user to input two numbers and an operator
 * and performs the specified calculation. The core logic is encapsulated in a separate,
 * easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class SimpleCalculator_improved {

    /**
     * Performs an arithmetic calculation based on the provided operator and numbers.
     *
     * @param operator The operator (+, -, *, /).
     * @param num1 The first number.
     * @param num2 The second number.
     * @return An Optional containing the result of the calculation, or an empty Optional
     *         if the operation is invalid (e.g., division by zero).
     */
    public Optional<Double> calculate(char operator, double num1, double num2) {
        return switch (operator) {
            case '+' -> Optional.of(num1 + num2);
            case '-' -> Optional.of(num1 - num2);
            case '*' -> Optional.of(num1 * num2);
            case '/' -> (num2 != 0) ? Optional.of(num1 / num2) : Optional.empty();
            default -> Optional.empty();
        };
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the calculate method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Input operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Input second number: ");
            double num2 = scanner.nextDouble();

            SimpleCalculator_improved calculator = new SimpleCalculator_improved();
            Optional<Double> result = calculator.calculate(operator, num1, num2);

            result.ifPresentOrElse(
                    res -> System.out.println(num1 + " " + operator + " " + num2 + " = " + res),
                    () -> {
                        if (operator == '/' && num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Error: Invalid operator!");
                        }
                    }
            );
        }
    }
}
