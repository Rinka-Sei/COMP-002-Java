package Practice;

import java.util.*;

public class ArithmeticCalculator {

    private Scanner sc;

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

    // separate methods for arithmetic process
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int[] input() {
        this.sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b = sc.nextInt();
        return new int[]{a, b};
    }
}
