package BSIT1stSem.SwitchStatements;

import java.util.*;

public class DayOfWeek {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number (1-7): ");
            int dayNumber = scanner.nextInt();
            String dayName;

            dayName = switch (dayNumber) {
                case 1 ->
                    "Sunday";
                case 2 ->
                    "Monday";
                case 3 ->
                    "Tuesday";
                case 4 ->
                    "Wednesday";
                case 5 ->
                    "Thursday";
                case 6 ->
                    "Friday";
                case 7 ->
                    "Saturday";
                default ->
                    "Invalid number. Please enter a number between 1 and 7.";
            };

            System.out.println("The corresponding day is: " + dayName);
        }
    }
}
