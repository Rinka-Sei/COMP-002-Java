/**
 * This class maps a user-provided character (A-Z) to a corresponding country name.
 */
package BSIT1stSem.Seatworks;

import java.util.*;

/**
 * The CountryCharacters class is a simple Java program that prompts the user to enter a single
 * letter from A to Z. It then maps this letter to a country name from a predefined list.
 * The program includes input validation to ensure that the user enters a valid character.
 *
 * @author Jules
 * @version 1.0
 */
public class CountryCharacters {

    /**
     * The main entry point of the program.
     * It takes a single character as input, validates it, and then prints the corresponding
     * country name.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=============================");
            System.out.println("=   Characters to Country   =");
            System.out.println("=============================");
            System.out.print("   Enter a Character from A-Z: ");
            input = sc.next();
        }

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] countries = {"Africa", "Brazil", "China", "Denmark", "England", "France", "Germany", "Haiti", "India", "Japan", "Kazakhstan", "Laos", "Mexico", "Nigeria", "Oman", "Philippines", "Qatar", "Russia", "Spain", "Thailand", "Uganda", "Venezuela", "Wales", "No Country for Letter X", "Yemen", "Zambia"};

        // Input Validation and Error Handling
        if (input.length() == 1 && alphabet.contains(input.toLowerCase())) {
            char character = input.toLowerCase().charAt(0);

            if (character == 'x') {
                System.err.println("Country is No Country for Letter X");
            } else {
                System.out.println("Country is " + countries[alphabet.indexOf(character)]);
            }
        } else {
            System.err.println("Invalid input. Please enter a single character from A-Z.");
        }
    }
}
