/**
 * This class determines the age category (child, teen, adult) based on a user-provided age.
 */
package BSIT1stSem.Seatworks;

import java.util.Scanner;

/**
 * The AgeCategory class is a simple Java program that prompts the user to enter their age.
 * It then uses a series of if-else statements to determine the appropriate age category and
 * prints the result to the console.
 *
 * @author Jules
 * @version 1.0
 */
public class AgeCategory {

    /**
     * The main entry point of the program.
     * It takes an age as input from the user, determines the corresponding age category,
     * and displays it.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("teen");
        } else {
            System.out.println("adult");
        }
    }
}
