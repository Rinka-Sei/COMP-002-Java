/**
 * This class determines if a student has passed or failed based on a user-provided grade.
 */
package BSIT1stSem.IfStatements;

import java.util.*;

/**
 * The PassOrFail class is a simple Java program that prompts the user to enter a student's grade.
 * It then determines whether the grade is a passing or failing mark based on a threshold of 75.0.
 * The result is printed to the console. This class is a basic example of conditional logic.
 *
 * @author Jules
 * @version 1.0
 */
public class PassOrFail {

    /**
     * The main entry point of the program.
     * It takes a grade as input from the user and determines if it's a passing or failing grade.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the student's grade: ");
            double grade = scanner.nextDouble();
            String result;

            // Condition: >= 75 is Pass, < 75 is Fail
            if (grade >= 75.0) {
                result = "**Pass**";
            } else {
                result = "**Fail**";
            }

            System.out.println("Result: " + result);
        }
    }
}
