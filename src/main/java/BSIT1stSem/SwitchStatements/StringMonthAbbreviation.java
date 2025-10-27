/**
 * This class converts a 3-letter month abbreviation into the full month name.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The StringMonthAbbreviation class prompts the user to enter a three-letter month
 * abbreviation (e.g., "Jan", "Feb"). It then uses a switch statement to find the
 * corresponding full month name. The input is standardized to be case-insensitive.
 *
 * @author Jules
 * @version 1.0
 */
public class StringMonthAbbreviation {

    /**
     * The main entry point of the program.
     * It takes a month abbreviation as input, standardizes its format, and then
     * uses a switch statement to determine the full month name.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a month abbreviation (e.g., 'Jan', 'Feb'): ");
            // Convert to proper case (first letter uppercase, rest lowercase)
            String abbr = scanner.next();
            String standardizedAbbr = abbr.substring(0, 1).toUpperCase() + abbr.substring(1).toLowerCase();

            String fullName;

            fullName = switch (standardizedAbbr) {
                case "Jan" ->
                    "January";
                case "Feb" ->
                    "February";
                case "Mar" ->
                    "March";
                case "Apr" ->
                    "April";
                case "May" ->
                    "May";
                case "Jun" ->
                    "June";
                case "Jul" ->
                    "July";
                case "Aug" ->
                    "August";
                case "Sep" ->
                    "September";
                case "Oct" ->
                    "October";
                case "Nov" ->
                    "November";
                case "Dec" ->
                    "December";
                default ->
                    "Invalid month abbreviation.";
            };

            System.out.println("Full month name: " + fullName);
        }
    }
}
