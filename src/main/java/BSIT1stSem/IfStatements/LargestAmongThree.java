package BSIT1stSem.IfStatements;

import java.util.*;

public class LargestAmongThree {

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
