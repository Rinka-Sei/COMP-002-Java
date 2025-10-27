/**
 * This class simulates a simple menu selection process.
 * This improved version separates the logic for getting the menu selection into a separate method
 * for better testability and uses a Map for a more scalable and flexible implementation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Map;
import java.util.Scanner;

/**
 * The MenuSelection_improved class presents a user with a simple menu of options and displays
 * the selected item. The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class MenuSelection_improved {

    /**
     * A map that stores the mapping between menu choices and item names.
     */
    private static final Map<Integer, String> MENU_MAP = Map.of(
            1, "Burger",
            2, "Fries",
            3, "Drink",
            4, "Exit - Thank you!"
    );

    /**
     * Gets the selected menu item based on the provided choice.
     *
     * @param choice The user's menu choice.
     * @return The name of the selected item, or an error message if the choice is invalid.
     */
    public String getMenuSelection(int choice) {
        return MENU_MAP.getOrDefault(choice, "Invalid choice. Please select 1, 2, 3, or 4.");
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getMenuSelection method to determine the result.
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
            MenuSelection_improved menu = new MenuSelection_improved();
            String selectedItem = menu.getMenuSelection(choice);

            System.out.println("You selected: " + selectedItem);
        }
    }
}
