package BSIT1stSem.Loop.finals;

import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, difference;
        
        System.out.print("Enter start number: ");
        num1 = scan.nextInt();
        
        System.out.print("Enter end number: ");
        num2 = scan.nextInt();
        
        scan.close();
        
        // Basic check for valid range
        if (num1 > num2) {
            System.out.println("Error: Start number cannot be greater than end number.");
            return;
        }

        difference = num2 - num1;

        // ===============================================
        // LOOP GROUP 1: LISTING ALL NUMBERS
        // ===============================================
        System.out.println("\n--- Loop Group 1: Listing Numbers (" + num1 + " to " + num2 + ") ---");

        System.out.println("For Loop:");
        for (int x = 0; x <= difference; x++) {
            System.out.println(x + num1);
        }

        System.out.println("\nWhile Loop:");
        int x = 0;
        while (x <= difference) {
            System.out.println(x + num1);
            x++;
        }
        
        System.out.println("\nDo-While Loop:");
        x = 0;
        do {
            System.out.println(x + num1);
            x++;
        } while (x <= difference);

        // ===============================================
        // LOOP GROUP 2: SUMMING ALL NUMBERS
        // ===============================================
        System.out.println("\n--- Loop Group 2: Summing Numbers (" + num1 + " to " + num2 + ") ---");
        
        // WHILE LOOP SUM
        System.out.println("While Loop Sum:");
        int sum = 0;
        x = 0;
        while (x <= difference) {
            sum += num1 + x;
            x++;
        }
        System.out.println("Total Sum: " + sum);

        // DO-WHILE LOOP SUM
        System.out.println("\nDo-While Loop Sum:");
        x = 0;
        sum = 0;
        do {
            sum += num1 + x;
            x++;
        } while (x <= difference);
        System.out.println("Total Sum: " + sum);

        // FOR LOOP SUM
        System.out.println("\nFor Loop Sum:");
        sum = 0;
        for (x = 0; x <= difference; x++) {
            sum += num1 + x;
        }
        System.out.println("Total Sum: " + sum);
    }
}