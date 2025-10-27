/**
 * This class maps a user-provided number (1-7) to the corresponding day of the week.
 * This improved version separates the logic for getting the day name into a separate method
 * for better testability and uses a Map for a more scalable and flexible implementation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Map;
import java.util.Scanner;

/**
 * The DayOfWeek_improved class prompts the user to enter a number between 1 and 7 and
 * displays the corresponding day of the week. The core logic is encapsulated in a
 * separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class DayOfWeek_improved {

    /**
     * A map that stores the mapping between day numbers and day names.
     */
    private static final Map<Integer, String> DAY_MAP = Map.of(
            1, "Sunday",
            2, "Monday",
            3, "Tuesday",
            4, "Wednesday",
            5, "Thursday",
            6, "Friday",
            7, "Saturday"
    );

    /**
     * Gets the name of the day corresponding to the provided day number.
     *
     * @param dayNumber The number of the day (1-7).
     * @return The name of the day, or an error message if the number is invalid.
     */
    public String getDayOfWeek(int dayNumber) {
        return DAY_MAP.getOrDefault(dayNumber, "Invalid number. Please enter a number between 1 and 7.");
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getDayOfWeek method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number (1-7): ");
            int dayNumber = scanner.nextInt();
            DayOfWeek_improved dayOfWeek = new DayOfWeek_improved();
            String dayName = dayOfWeek.getDayOfWeek(dayNumber);
            System.out.println("The corresponding day is: " + dayName);
        }
    }
}
