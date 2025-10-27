/**
 * This class determines the age category (Child, Teen, Adult, Senior) based on a user-provided age.
 * This improved version separates the logic for determining the age category into a separate method
 * for better testability and adherence to the single responsibility principle.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The AgeCategory_improved class prompts the user to enter their age and determines the
 * appropriate age category. The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class AgeCategory_improved {

    /**
     * Determines the age category based on the provided age.
     * This method contains the core logic for categorizing ages and is designed to be
     * easily unit-tested.
     *
     * @param age The age to be categorized.
     * @return The corresponding age category as a String.
     */
    public String getAgeCategory(int age) {
        if (age < 0) {
            return "Invalid Age";
        } else if (age < 13) {
            return "**Child** (<13)";
        } else if (age <= 19) {
            return "**Teen** (13–19)";
        } else if (age <= 59) {
            return "**Adult** (20–59)";
        } else {
            return "**Senior** (60+)";
        }
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getAgeCategory method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input age: ");
            int age = scanner.nextInt();
            AgeCategory_improved ageCategory = new AgeCategory_improved();
            String category = ageCategory.getAgeCategory(age);
            System.out.println("Age Category: " + category);
        }
    }
}
