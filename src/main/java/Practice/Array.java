/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.*;

/**
 *
 * @author mj
 */
public class Array {

    // create an array of names to be entered and print all of them
    public static String getOrdinalSuffix(int n) {
        if (n >= 11 && n <= 13) {
            return "th";
        }
        return switch (n % 10) {
            case 1 ->
                "st";
            case 2 ->
                "nd";
            case 3 ->
                "rd";
            default ->
                "th";
        };
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x;

            System.out.print("Enter number of Names: ");
            x = scan.nextInt();

            // Input validation
            if (x <= 0) {
                System.err.println("Error: Number of entries must be greater than zero. Average cannot be calculated.");
                scan.close();
                return;
            }

            scan.nextLine();
            String[] names = new String[x];

            for (int i = 0; i < names.length; i++) {
                int sequence = i + 1;
                String suffix = getOrdinalSuffix(sequence);
                System.out.println("Enter " + sequence + suffix + " Name: ");
                names[i] = scan.nextLine();
            }

            // Manual Style
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Hello " + names[i] + "!");
//        }
// New Enhanced For-Loop (For-Each)
            for (String name : names) {
                System.out.println("Hello " + name + "!");
            }
        }
    }
}
