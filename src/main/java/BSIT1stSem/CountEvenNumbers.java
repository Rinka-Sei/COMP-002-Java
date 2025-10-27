/**
 * This class counts the number of even numbers from a list of ten integers provided by the user.
 */
package BSIT1stSem;

import java.util.*;

/**
 * The CountEvenNumbers class is a simple Java program that prompts the user to enter
 * ten integers. It then counts and displays the total number of even numbers in the list.
 * This class demonstrates array handling and conditional logic in a loop.
 *
 * @author Jules
 * @version 1.0
 */
public class CountEvenNumbers {

    /**
     * The main entry point of the program.
     * It takes ten integers as input from the user, stores them in an array,
     * and counts how many of them are even. The final count is printed to the console.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, evenNumbers;

        int numbers[] = new int[10];
        evenNumbers = 0;
        i = 0;

        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        }
        sc.close();

        // for checking purposes
        for (int number : numbers) {
            System.out.println(number);
        }

        // My Approach
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers += 1;
            }
        }

        // For-each loop apporoach
        /*
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers += 1;
                }
            }
         */
        System.out.println("Total number of even numbers: " + evenNumbers);

    }
}
