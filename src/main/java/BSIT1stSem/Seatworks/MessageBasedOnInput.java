/**
 * This class displays a specific message based on an integer input from the user.
 */
package BSIT1stSem.Seatworks;

import java.util.Scanner;

/**
 * The MessageBasedOnInput class is a simple Java program that prompts the user to enter an integer.
 * It then uses a series of if-else-if statements to print a predefined message corresponding
 * to the input value. If the input does not match any of the predefined values, it prints
 * an "Invalid input" message.
 *
 * @author Jules
 * @version 1.0
 */
public class MessageBasedOnInput {

    /**
     * The main entry point of the program.
     * It takes an integer as input and prints a message based on its value.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("Hello World");
        } else if (input == 2) {
            System.out.println("I am Groot");
        } else if (input == 3) {
            System.out.println("To The Top");
        } else if (input == 4) {
            System.out.println("Where is the Horizon?");
        } else if (input == 5) {
            System.out.println("I don't know");
        } else if (input == 6) {
            System.out.println("Yeah, I will");
        } else {
            System.out.println("Invalid input");
        }
    }
}
