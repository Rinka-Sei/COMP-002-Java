/**
 * This class simulates a simple menu selection process.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The MenuSelection class presents a user with a simple menu of options (Burger, Fries, Drink, Exit).
 * The user selects an option by entering a number, and the program displays the selected item.
 * This class demonstrates the use of a switch statement to handle menu-based user input.
 *
 * @author Jules
 * @version 1.0
 */
public class MenuSelection {

    /**
     * The main entry point of the program.
     * It displays a menu, takes the user's choice as input, and uses a switch statement
     * to determine the selected option.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Burger");
            System.out.println("2. Fries");
            System.out.println("3. Drink");
            System.out.println("4. Exit");
            System.out.print("Input your choice (1–4): ");

            int choice = scanner.nextInt();
            String selectedItem;

            selectedItem = switch (choice) {
                case 1 ->
                    "Burger";
                case 2 ->
                    "Fries";
                case 3 ->
                    "Drink";
                case 4 ->
                    "Exit - Thank you!";
                default ->
                    "Invalid choice. Please select 1, 2, 3, or 4.";
            };

            System.out.println("You selected: " + selectedItem);
        }
    }
}
