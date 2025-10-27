/**
 * This class determines if a user-provided number is positive, negative, or zero.
 */
package BSIT1stSem.Seatworks;

import java.util.Scanner;

/**
 * The NumberSign class is a simple Java program that prompts the user to enter a whole number.
 * It then determines whether the number is positive, negative, or zero using if-else-if statements.
 * The result is printed to the console.
 *
 * @author Jules
 * @version 1.0
 */
public class NumberSign {

    /**
     * The main entry point of the program.
     * It takes a number as input from the user and determines its sign.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
