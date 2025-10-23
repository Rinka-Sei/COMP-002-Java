package BSIT1stSem.Switch;

import java.util.*;

public class MenuSelection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Menu ---");
        System.out.println("1. Burger");
        System.out.println("2. Fries");
        System.out.println("3. Drink");
        System.out.println("4. Exit");
        System.out.print("Input your choice (1–4): ");

        int choice = scanner.nextInt();
        String selectedItem;

        switch (choice) {
            case 1:
                selectedItem = "Burger";
                break;
            case 2:
                selectedItem = "Fries";
                break;
            case 3:
                selectedItem = "Drink";
                break;
            case 4:
                selectedItem = "Exit - Thank you!";
                break;
            default:
                selectedItem = "Invalid choice. Please select 1, 2, 3, or 4.";
        }

        System.out.println("You selected: " + selectedItem);
        scanner.close();
    }
}
