package BSIT1stSem.IfStatements;

import java.util.*;

public class LeapYearChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a year: ");
            int year = scanner.nextInt();
            boolean isLeap = false;

            // A year is a leap year if it is divisible by 4,
            // unless it is divisible by 100 but not by 400.
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else {
                isLeap = year % 4 == 0;
            }

            if (isLeap) {
                System.out.println(year + " is a **Leap Year**.");
            } else {
                System.out.println(year + " is **not a Leap Year**.");
            }
        }
    }
}
