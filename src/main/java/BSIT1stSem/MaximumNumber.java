/**
 * This class finds the maximum and minimum numbers from a list of seven integers provided by the user.
 */
package BSIT1stSem;

import java.util.*;

/**
 * The MaximumNumber class is a simple Java program that prompts the user to enter seven integers.
 * It then finds and displays the largest and smallest numbers in the list. This class
 * demonstrates array handling and finding the extreme values in a collection.
 *
 * @author Jules
 * @version 1.0
 */
public class MaximumNumber {

    /**
     * The main entry point of the program.
     * It takes seven integers as input from the user, stores them in an array,
     * and then iterates through the array to find the maximum and minimum values.
     * The results are printed to the console.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int numbers[] = new int[7];

        i = 0;
        while (i < 7) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        }
        sc.close();

        // for checking purposes
        for (int number : numbers) {
            System.out.println(number);
        }

        int max = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int min = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The Largest number in the array is: " + max);
        System.out.println("The Smallest number in the array is: " + min);

    }
}
