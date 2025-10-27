/**
 * This class calculates the area of a rectangle based on user-provided length and width.
 */
package BSIT1stSem;

import java.util.*;

/**
 * The AreaofRectangle class is a simple Java program that prompts the user to enter
 * the length and width of a rectangle. It then calculates and displays the area.
 * This class serves as a basic example of handling user input and performing
 * simple arithmetic operations in Java.
 *
 * @author Jules
 * @version 1.0
 */
public class AreaofRectangle {

    /**
     * The main entry point of the program.
     * It takes user input for the length and width of a rectangle, calculates the area,
     * and prints the result to the console.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length, width, area;

        System.out.println("enter length: ");
        length = scan.nextDouble();

        System.out.println("Enter width: ");
        width = scan.nextDouble();

        area = length * width;

        System.out.println("The area is :" + area + " square units");
    }
}
