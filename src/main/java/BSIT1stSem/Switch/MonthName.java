package BSIT1stSem.Switch;

import java.util.*;

public class MonthName {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input month number (1–12): ");
            int monthNumber = scanner.nextInt();
            String monthName;

            monthName = switch (monthNumber) {
                case 1 ->
                    "January";
                case 2 ->
                    "February";
                case 3 ->
                    "March";
                case 4 ->
                    "April";
                case 5 ->
                    "May";
                case 6 ->
                    "June";
                case 7 ->
                    "July";
                case 8 ->
                    "August";
                case 9 ->
                    "September";
                case 10 ->
                    "October";
                case 11 ->
                    "November";
                case 12 ->
                    "December";
                default ->
                    "Invalid month number.";
            };

            System.out.println("The month is: " + monthName);
        }
    }
}
