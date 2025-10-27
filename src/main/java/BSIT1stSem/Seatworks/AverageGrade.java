/**
 * This class calculates the average of three grades (prelims, midterms, and finals).
 */
package BSIT1stSem.Seatworks;

import java.util.*;

/**
 * The AverageGrade class is a simple Java program that prompts the user to enter their grades
 * for prelims, midterms, and finals. It then calculates the average of these three grades
 * and displays the result.
 *
 * @author Jules
 * @version 1.0
 */
public class AverageGrade {

    /**
     * The main entry point of the program.
     * It takes three grades as input from the user, calculates the average, and prints it.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double prelims, midterms, finals, total, ave;
            System.out.println("Grade in Prelims:");
            prelims = sc.nextDouble();
            System.out.println("Grade in Midterms: ");
            midterms = sc.nextDouble();
            System.out.println("Grade in Finals: ");
finals = sc.nextDouble();
            total = prelims + midterms + finals;
            ave = total / 3;
            System.out.println("Your average is: " + ave);
        }
    }

}
