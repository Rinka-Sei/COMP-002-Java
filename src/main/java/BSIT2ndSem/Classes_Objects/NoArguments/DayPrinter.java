package BSIT2ndSem.Classes_Objects.NoArguments;

import java.util.*;

public class DayPrinter {
// use static here if w
    public void DaysOfTheWeek(Scanner sc) {
        System.out.println("Days of the Week Printer");
        System.out.print("Enter numbers 1-7: ");

        // Error handling: Check if input is actually an integer
        if (!sc.hasNextByte()) {
            System.out.println("Error: Please enter a number.");
            sc.nextLine(); // Clear the invalid input
            return;
        }

        final byte DayNum = sc.nextByte();

        sc.nextLine(); // Consume the Line to make way for another scan

        String day = switch (DayNum) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day);
    }
}
