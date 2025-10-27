/**
 * This class maps a user-provided month number (1-12) to the corresponding month name.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The MonthName class is a simple Java program that prompts the user to enter a number
 * between 1 and 12. It then uses a switch statement to determine the corresponding
 * month name and prints the result. This class is a straightforward example of
 * using a switch statement for integer-to-string mapping.
 *
 * @author Jules
 * @version 1.0
 */
public class MonthName {

    /**
     * The main entry point of the program.
     * It takes a month number as input from the user and uses a switch statement
     * to find the corresponding month name.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input month number (1–12): ");
            int monthNumber = scanner.nextInt();
            String monthName;

            monthName = switch (monthNumber) {
                case 1 ->
                    "January";
                case 2 ->
                    "February";
                case 3 ->
                    "March";
                case 4 ->
                    "April";
                case 5 ->
                    "May";
                case 6 ->
                    "June";
                case 7 ->
                    "July";
                case 8 ->
                    "August";
                case 9 ->
                    "September";
                case 10 ->
                    "October";
                case 11 ->
                    "November";
                case 12 ->
                    "December";
                default ->
                    "Invalid month number.";
            };

            System.out.println("The month is: " + monthName);
        }
    }
}
