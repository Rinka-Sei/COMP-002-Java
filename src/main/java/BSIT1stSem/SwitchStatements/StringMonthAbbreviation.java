package BSIT1stSem.SwitchStatements;

import java.util.*;

public class StringMonthAbbreviation {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a month abbreviation (e.g., 'Jan', 'Feb'): ");
            // Convert to proper case (first letter uppercase, rest lowercase)
            String abbr = scanner.next();
            String standardizedAbbr = abbr.substring(0, 1).toUpperCase() + abbr.substring(1).toLowerCase();

            String fullName;

            fullName = switch (standardizedAbbr) {
                case "Jan" ->
                    "January";
                case "Feb" ->
                    "February";
                case "Mar" ->
                    "March";
                case "Apr" ->
                    "April";
                case "May" ->
                    "May";
                case "Jun" ->
                    "June";
                case "Jul" ->
                    "July";
                case "Aug" ->
                    "August";
                case "Sep" ->
                    "September";
                case "Oct" ->
                    "October";
                case "Nov" ->
                    "November";
                case "Dec" ->
                    "December";
                default ->
                    "Invalid month abbreviation.";
            };

            System.out.println("Full month name: " + fullName);
        }
    }
}
