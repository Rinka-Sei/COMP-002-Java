/**
 * This class maps a user-provided number (1-7) to the corresponding day of the week.
 */
package BSIT1stSem.Seatworks;

import java.util.Scanner;

/**
 * The WeekdayGenerator class is a simple Java program that prompts the user to enter a number
 * between 1 and 7. It then uses a series of if-else-if statements to determine the
 * corresponding day of the week and prints the result.
 *
* @author Jules
 * @version 1.0
 */
public class WeekdayGenerator {

    /**
     * The main entry point of the program.
     * It takes a number as input from the user and prints the corresponding day of the week.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number (1-7): ");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Sunday");
        } else if (input == 2) {
            System.out.println("Monday");
        } else if (input == 3) {
            System.out.println("Tuesday");
        } else if (input == 4) {
            System.out.println("Wednesday");
        } else if (input == 5) {
            System.out.println("Thursday");
        } else if (input == 6) {
            System.out.println("Friday");
        } else if (input == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}
