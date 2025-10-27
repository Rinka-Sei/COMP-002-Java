/**
 * This class converts an amount in Philippine Pesos (PHP) to US Dollars (USD).
 */
package BSIT1stSem.Seatworks;

import java.util.*;

/**
 * The CurrencyConverter class is a simple Java program that prompts the user to enter an amount
 * in Philippine Pesos. It then converts this amount to US Dollars using a fixed exchange rate
 * and displays the result.
 *
 * @author Jules
 * @version 1.0
 */
public class CurrencyConverter {

    /**
     * The main entry point of the program.
     * It takes an amount in PHP as input, converts it to USD, and prints the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter PHP: ");
            double Pesos = sc.nextInt();
            double Dollars = Pesos / 57;
            System.out.println("Your money in Dollars is: $" + Dollars);
        }
    }
}
