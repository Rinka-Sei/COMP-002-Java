/**
 * This class converts a user-provided value in centimeters to meters and kilometers.
 */
package BSIT1stSem;

import java.util.*;

/**
 * The Main class is a simple Java program that takes a value in centimeters from the user
 * and converts it to meters and kilometers. It serves as a basic example of unit conversion
 * and input/output operations in Java.
 *
 * @author Jules
 * @version 1.0
 */
public class Main {

    /**
     * The main entry point of the program.
     * It prompts the user to enter a value in centimeters, performs the conversion,
     * and displays the results in meters and kilometers.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try (Scanner scan = new Scanner(System.in)) {
            double kilometer, meter, value;
            System.out.print("Enter cm: ");
            value = scan.nextDouble();
            meter = value / 100.0;
            kilometer = value / 100000.0;
            System.out.println("meters is: " + meter);
            System.out.println("kilometers is: " + kilometer);
        }
    }
}
