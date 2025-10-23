package BSIT1stSem.IfStatements;

import java.util.*;

public class NumberSignChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            double number = scanner.nextDouble();

            if (number > 0) {
                System.out.println("The number is **Positive**.");
            } else if (number < 0) {
                System.out.println("The number is **Negative**.");
            } else {
                System.out.println("The number is **Zero**.");
            }
        }
    }
}
