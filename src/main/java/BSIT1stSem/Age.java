/**
 * This class demonstrates basic input and output in Java, calculating the user's birth year.
 */
package BSIT1stSem;

import java.util.*;

/**
 * The Age class prompts the user for their name and age, then calculates their birth year
 * and provides a message based on their age. This serves as a simple example of
 * user interaction and basic conditional logic in Java.
 *
 * @author Jules
 * @version 1.0
 */
public class Age {

    /**
     * The main entry point of the program.
     * It takes user input for name and age, and then computes the birth year.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int birthyear, age;
        String name;

        // Asking for Personal Info
        System.out.print("Enter your Name: ");
        name = scan.nextLine();
        System.out.print("Enter Age: ");
        age = scan.nextInt();
        System.out.println(name + " your age is " + age);

        // Age moderation
        if (age < 18) {
            System.out.println("You are too young in this world!");
        } else {
            System.out.println("Go on");
        }
        // Birthyear Identifier
        birthyear = 2025 - age;

        System.out.println("You are born in: " + birthyear);
    }
}
