/**
 * This class determines if a student has passed or failed based on a user-provided grade.
 * This improved version separates the logic for checking the grade into a separate method
 * for better testability and uses a ternary operator for more concise code.
 */
package BSIT1stSem.IfStatements_improved;

import java.util.Scanner;

/**
 * The PassOrFail_improved class prompts the user to enter a student's grade and determines
 * if it is a passing or failing grade. The core logic is encapsulated in a separate,
 * easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class PassOrFail_improved {

    /**
     * The passing grade threshold.
     */
    private static final double PASSING_GRADE = 75.0;

    /**
     * Determines if the provided grade is a passing or failing grade.
     *
     * @param grade The grade to be checked.
     * @return A string indicating whether the grade is a "Pass" or "Fail".
     */
    public String checkPassOrFail(double grade) {
        return (grade >= PASSING_GRADE) ? "**Pass**" : "**Fail**";
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the checkPassOrFail method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the student's grade: ");
            double grade = scanner.nextDouble();
            PassOrFail_improved checker = new PassOrFail_improved();
            String result = checker.checkPassOrFail(grade);
            System.out.println("Result: " + result);
        }
    }
}
