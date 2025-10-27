/**
 * This class determines if a user-provided year is a leap year.
 * This improved version separates the logic for checking for a leap year into a separate method
 * for better testability and uses a more concise boolean expression.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The LeapYearChecker_improved class prompts the user to enter a year and determines if it is a leap year.
 * The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class LeapYearChecker_improved {

    /**
     * Checks if the provided year is a leap year.
     * A year is a leap year if it is divisible by 4, unless it is divisible by 100 but not by 400.
     *
     * @param year The year to be checked.
     * @return true if the year is a leap year, false otherwise.
     */
    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the isLeapYear method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a year: ");
            int year = scanner.nextInt();
            LeapYearChecker_improved checker = new LeapYearChecker_improved();

            if (checker.isLeapYear(year)) {
                System.out.println(year + " is a **Leap Year**.");
            } else {
                System.out.println(year + " is **not a Leap Year**.");
            }
        }
    }
}
