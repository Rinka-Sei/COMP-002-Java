/**
 * This class maps a user-provided month number (1-12) to the corresponding month name.
 * This improved version separates the logic for getting the month name into a separate method
 * for better testability and uses a Map for a more scalable and flexible implementation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Map;
import java.util.Scanner;

/**
 * The MonthName_improved class prompts the user to enter a number between 1 and 12 and
 * displays the corresponding month name. The core logic is encapsulated in a separate,
 * easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class MonthName_improved {

    /**
     * A map that stores the mapping between month numbers and month names.
     */
    private static final Map<Integer, String> MONTH_MAP = Map.ofEntries(
            Map.entry(1, "January"),
            Map.entry(2, "February"),
            Map.entry(3, "March"),
            Map.entry(4, "April"),
            Map.entry(5, "May"),
            Map.entry(6, "June"),
            Map.entry(7, "July"),
            Map.entry(8, "August"),
            Map.entry(9, "September"),
            Map.entry(10, "October"),
            Map.entry(11, "November"),
            Map.entry(12, "December")
    );

    /**
     * Gets the name of the month corresponding to the provided month number.
     *
     * @param monthNumber The number of the month (1-12).
     * @return The name of the month, or an error message if the number is invalid.
     */
    public String getMonthName(int monthNumber) {
        return MONTH_MAP.getOrDefault(monthNumber, "Invalid month number.");
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getMonthName method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input month number (1–12): ");
            int monthNumber = scanner.nextInt();
            MonthName_improved monthName = new MonthName_improved();
            String name = monthName.getMonthName(monthNumber);
            System.out.println("The month is: " + name);
        }
    }
}
