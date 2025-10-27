/**
 * This class provides a simple arithmetic menu that allows users to perform basic calculations.
 * This improved version separates the calculation logic into a separate method for better testability
 * and uses a record to return the result of the calculation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Scanner;

/**
 * The ArithmeticMenu_improved class presents a user with a menu of arithmetic operations.
 * The core calculation logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class ArithmeticMenu_improved {

    /**
     * A record to hold the result of a calculation.
     *
     * @param result The result of the calculation.
     * @param operation The name of the operation.
     * @param validOperation A boolean indicating if the operation was valid.
     */
    public record CalculationResult(double result, String operation, boolean validOperation) {}

    /**
     * Performs an arithmetic calculation based on the provided option and numbers.
     *
     * @param option The menu option (1-4).
     * @param num1 The first number.
     * @param num2 The second number.
     * @return A CalculationResult object containing the result of the calculation.
     */
    public CalculationResult calculate(int option, double num1, double num2) {
        double result = 0;
        String operation = "";
        boolean validOperation = true;

        switch (option) {
            case 1 -> {
                result = num1 + num2;
                operation = "Addition";
            }
            case 2 -> {
                result = num1 - num2;
                operation = "Subtraction";
            }
            case 3 -> {
                result = num1 * num2;
                operation = "Multiplication";
            }
            case 4 -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    operation = "Division";
                } else {
                    validOperation = false;
                }
            }
            default -> validOperation = false;
        }
        return new CalculationResult(result, operation, validOperation);
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the calculate method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n--- Arithmetic Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Input your option (1-4): ");
            int option = scanner.nextInt();
            System.out.print("Input the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Input the second number: ");
            double num2 = scanner.nextDouble();

            ArithmeticMenu_improved menu = new ArithmeticMenu_improved();
            CalculationResult calcResult = menu.calculate(option, num1, num2);

            if (calcResult.validOperation()) {
                System.out.println("Result of " + calcResult.operation() + ": " + calcResult.result());
            } else {
                if (option == 4) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Error: Invalid menu option.");
                }
            }
        }
    }
}
