/**
 * This class calculates the sum of ten numbers provided by the user.
 */
package BSIT1stSem.Seatworks;

import java.util.*;

/**
 * The Sumof10 class is a simple Java program that prompts the user to enter ten numbers.
 * It then calculates and displays the sum of these numbers. This class demonstrates
 * basic array handling and looping in Java.
 *
 * @author Jules
 * @version 1.0
 */
public class Sumof10 {

    /**
     * The main entry point of the program.
     * It takes ten numbers as input from the user, stores them in an array,
     * calculates the sum, and prints the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[10];
        double sum = 0;

        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            sum += num[i];
            i++;
        }

        sc.close();
        System.out.println("The sum of 10 integers is: " + sum);

    }
}
