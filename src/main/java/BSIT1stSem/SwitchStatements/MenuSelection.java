package BSIT1stSem.SwitchStatements;

import java.util.*;

public class MenuSelection {

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
