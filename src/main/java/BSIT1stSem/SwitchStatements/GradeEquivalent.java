/**
 * This class provides a textual equivalent (remarks) for a user-provided letter grade.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The GradeEquivalent class is a simple Java program that prompts the user to enter a letter grade
 * (A, B, C, D, or F). It then uses a switch statement to determine the corresponding remarks
 * (e.g., "Excellent" for 'A') and prints the result. The input is case-insensitive.
 *
 * @author Jules
 * @version 1.0
 */
public class GradeEquivalent {

    /**
     * The main entry point of the program.
     * It takes a letter grade as input from the user and uses a switch statement
     * to find the corresponding remarks.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a grade letter (A, B, C, D, F): ");
            // Read the first character and convert to uppercase for case-insensitivity
            char grade = Character.toUpperCase(scanner.next().charAt(0));
            String remarks;

            remarks = switch (grade) {
                case 'A' ->
                    "Excellent";
                case 'B' ->
                    "Very Good";
                case 'C' ->
                    "Good";
                case 'D' ->
                    "Fair";
                case 'F' ->
                    "Failed";
                default ->
                    "Invalid grade letter.";
            };

            System.out.println("Remarks: " + remarks);
        }
    }
}
