package BSIT1stSem.SwitchStatements;

import java.util.*;

public class SimpleCalculator {

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
