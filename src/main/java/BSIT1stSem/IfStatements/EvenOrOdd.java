package BSIT1stSem.IfStatements;

import java.util.*;

public class EvenOrOdd {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input an integer: ");
            int number = scanner.nextInt();

            // The modulo operator (%) returns the remainder of a division.
            if (number % 2 == 0) {
                System.out.println(number + " is an **Even** number.");
            } else {
                System.out.println(number + " is an **Odd** number.");
            }
        }
    }
}
