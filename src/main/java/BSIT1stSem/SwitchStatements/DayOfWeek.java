/**
 * This class maps a user-provided number (1-7) to the corresponding day of the week.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The DayOfWeek class is a simple Java program that prompts the user to enter a number
 * between 1 and 7. It then uses a switch statement to determine the corresponding day
 * of the week and prints the result. This class demonstrates a common use case for the
 * switch statement in mapping integer values to string representations.
 *
 * @author Jules
 * @version 1.0
 */
public class DayOfWeek {

    /**
     * The main entry point of the program.
     * It takes a number as input from the user and uses a switch statement
     * to find the corresponding day of the week.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number (1-7): ");
            int dayNumber = scanner.nextInt();
            String dayName;

            dayName = switch (dayNumber) {
                case 1 ->
                    "Sunday";
                case 2 ->
                    "Monday";
                case 3 ->
                    "Tuesday";
                case 4 ->
                    "Wednesday";
                case 5 ->
                    "Thursday";
                case 6 ->
                    "Friday";
                case 7 ->
                    "Saturday";
                default ->
                    "Invalid number. Please enter a number between 1 and 7.";
            };

            System.out.println("The corresponding day is: " + dayName);
        }
    }
}
