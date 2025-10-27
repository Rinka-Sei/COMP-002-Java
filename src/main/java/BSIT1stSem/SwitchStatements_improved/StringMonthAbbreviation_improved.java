/**
 * This class converts a 3-letter month abbreviation into the full month name.
 * This improved version separates the logic for getting the full month name into a separate method
 * for better testability and uses a Map for a more scalable and flexible implementation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Map;
import java.util.Scanner;

/**
 * The StringMonthAbbreviation_improved class prompts the user to enter a month abbreviation
 * and displays the full month name. The core logic is encapsulated in a separate, easily
 * testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class StringMonthAbbreviation_improved {

    /**
     * A map that stores the mapping between month abbreviations and full month names.
     */
    private static final Map<String, String> MONTH_MAP = Map.ofEntries(
            Map.entry("Jan", "January"),
            Map.entry("Feb", "February"),
            Map.entry("Mar", "March"),
            Map.entry("Apr", "April"),
            Map.entry("May", "May"),
            Map.entry("Jun", "June"),
            Map.entry("Jul", "July"),
            Map.entry("Aug", "August"),
            Map.entry("Sep", "September"),
            Map.entry("Oct", "October"),
            Map.entry("Nov", "November"),
            Map.entry("Dec", "December")
    );

    /**
     * Gets the full month name for the provided abbreviation.
     *
     * @param abbr The 3-letter month abbreviation.
     * @return The full month name, or an error message if the abbreviation is invalid.
     */
    public String getFullMonthName(String abbr) {
        if (abbr == null || abbr.length() < 3) {
            return "Invalid month abbreviation.";
        }
        String standardizedAbbr = abbr.substring(0, 1).toUpperCase() + abbr.substring(1).toLowerCase();
        return MONTH_MAP.getOrDefault(standardizedAbbr, "Invalid month abbreviation.");
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getFullMonthName method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a month abbreviation (e.g., 'Jan', 'Feb'): ");
            String abbr = scanner.next();
            StringMonthAbbreviation_improved converter = new StringMonthAbbreviation_improved();
            String fullName = converter.getFullMonthName(abbr);
            System.out.println("Full month name: " + fullName);
        }
    }
}
