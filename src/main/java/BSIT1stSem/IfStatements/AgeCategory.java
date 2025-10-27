/**
 * This class determines the age category (Child, Teen, Adult, Senior) based on a user-provided age.
 */
package BSIT1stSem.IfStatements;

import java.util.Scanner;

/**
 * The AgeCategory class is a simple Java program that prompts the user to enter their age.
 * It then uses a series of if-else statements to determine the appropriate age category and
 * prints the result to the console. This class serves as a basic example of conditional logic.
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
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input age: ");
            int age = scanner.nextInt();
            String category;

            if (age < 0) {
                category = "Invalid Age";
            } else if (age < 13) {
                category = "**Child** (<13)";
            } else if (age <= 19) { // 13-19
                category = "**Teen** (13–19)";
            } else if (age <= 59) { // 20-59
                category = "**Adult** (20–59)";
            } else { // 60+
                category = "**Senior** (60+)";
            }

            System.out.println("Age Category: " + category);
        }
    }
}
