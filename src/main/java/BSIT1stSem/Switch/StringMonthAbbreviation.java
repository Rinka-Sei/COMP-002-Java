package BSIT1stSem.Switch;

import java.util.*;

public class StringMonthAbbreviation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a month abbreviation (e.g., 'Jan', 'Feb'): ");
        // Convert to proper case (first letter uppercase, rest lowercase)
        String abbr = scanner.next();
        String standardizedAbbr = abbr.substring(0, 1).toUpperCase() + abbr.substring(1).toLowerCase();

        String fullName;

        switch (standardizedAbbr) {
            case "Jan":
                fullName = "January";
                break;
            case "Feb":
                fullName = "February";
                break;
            case "Mar":
                fullName = "March";
                break;
            case "Apr":
                fullName = "April";
                break;
            case "May":
                fullName = "May";
                break;
            case "Jun":
                fullName = "June";
                break;
            case "Jul":
                fullName = "July";
                break;
            case "Aug":
                fullName = "August";
                break;
            case "Sep":
                fullName = "September";
                break;
            case "Oct":
                fullName = "October";
                break;
            case "Nov":
                fullName = "November";
                break;
            case "Dec":
                fullName = "December";
                break;
            default:
                fullName = "Invalid month abbreviation.";
        }

        System.out.println("Full month name: " + fullName);
        scanner.close();
    }
}
