/**
 * This class calculates the area of a rectangle based on user-provided width and length,
 * and displays the result in both square meters and square centimeters.
 */
package BSIT1stSem.Seatworks;

import java.util.*;

/**
 * The AreaofRectangle class is a simple Java program that prompts the user to enter
 * the width and length of a rectangle in meters. It then calculates the area and
 * displays it in both square meters and square centimeters.
 *
 * @author Jules
 * @version 1.0
 */
public class AreaofRectangle {

    /**
     * The main entry point of the program.
     * It takes the width and length as input from the user, calculates the area,
     * and prints the result in two different units.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w, l, area;

        System.out.println("Enter width (in meters): ");
        w = sc.nextDouble();
        System.out.println("Enter length (in meters): ");
        l = sc.nextDouble();
        sc.close();

        area = w * l;

        System.out.println("The area is: " + area + " square meters");
        System.out.println("The area is: " + area * 10000 + " square centimeters");

    }
}
