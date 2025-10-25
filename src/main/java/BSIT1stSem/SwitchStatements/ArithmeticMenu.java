package BSIT1stSem.SwitchStatements;

import java.util.*;

public class ArithmeticMenu {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2, result = 0;
            System.out.println("\n--- Arithmetic Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Input your option (1-4): ");
            int option = scanner.nextInt();
            System.out.print("Input the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Input the second number: ");
            num2 = scanner.nextDouble();
            boolean validOperation = true;
            String operation = "";
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
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                }
                default -> {
                    System.out.println("Error: Invalid menu option.");
                    validOperation = false;
                }
            }
            if (validOperation) {
                System.out.println("Result of " + operation + ": " + result);
            }
        }
    }
}
