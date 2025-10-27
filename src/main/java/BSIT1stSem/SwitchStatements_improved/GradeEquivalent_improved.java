/**
 * This class provides a textual equivalent (remarks) for a user-provided letter grade.
 * This improved version separates the logic for getting the grade remarks into a separate method
 * for better testability and uses a Map for a more scalable and flexible implementation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Map;
import java.util.Scanner;

/**
 * The GradeEquivalent_improved class prompts the user to enter a letter grade and displays
 * the corresponding remarks. The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class GradeEquivalent_improved {

    /**
     * A map that stores the mapping between letter grades and remarks.
     */
    private static final Map<Character, String> GRADE_MAP = Map.of(
            'A', "Excellent",
            'B', "Very Good",
            'C', "Good",
            'D', "Fair",
            'F', "Failed"
    );

    /**
     * Gets the remarks for the provided letter grade.
     *
     * @param grade The letter grade (A, B, C, D, or F).
     * @return The corresponding remarks, or an error message if the grade is invalid.
     */
    public String getGradeRemarks(char grade) {
        return GRADE_MAP.getOrDefault(Character.toUpperCase(grade), "Invalid grade letter.");
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getGradeRemarks method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a grade letter (A, B, C, D, F): ");
            char grade = scanner.next().charAt(0);
            GradeEquivalent_improved gradeEquivalent = new GradeEquivalent_improved();
            String remarks = gradeEquivalent.getGradeRemarks(grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}
