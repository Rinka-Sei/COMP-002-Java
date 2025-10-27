/**
 * This class determines if a user-provided year is a leap year.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The LeapYearChecker class is a simple Java program that prompts the user to enter a year.
 * It then determines whether the year is a leap year based on the standard rules.
 * The result is printed to the console. This class demonstrates complex conditional logic.
 *
 * @author Jules
 * @version 1.0
 */
public class LeapYearChecker {

    /**
     * The main entry point of the program.
     * It takes a year as input from the user and determines if it is a leap year.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a year: ");
            int year = scanner.nextInt();
            boolean isLeap = false;

            // A year is a leap year if it is divisible by 4,
            // unless it is divisible by 100 but not by 400.
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else {
                isLeap = year % 4 == 0;
            }

            if (isLeap) {
                System.out.println(year + " is a **Leap Year**.");
            } else {
                System.out.println(year + " is **not a Leap Year**.");
            }
        }
    }
}
