/**
 * This class determines if a user-provided integer is even or odd.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The EvenOrOdd class is a simple Java program that prompts the user to enter an integer.
 * It then determines whether the number is even or odd by checking the remainder of a division by 2.
 * The result is printed to the console. This class is a fundamental example of conditional logic.
 *
 * @author Jules
 * @version 1.0
 */
public class EvenOrOdd {

    /**
     * The main entry point of the program.
     * It takes an integer as input from the user and determines if it's even or odd.
     *
     * @param args The command line arguments (not used in this program).
     */
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
