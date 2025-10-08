package xyz.pupbc.firstsem.seatwork1;

import java.util.Scanner;

public class WeekdayGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number (1-7): ");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Sunday");
        } else if (input == 2) {
            System.out.println("Monday");
        } else if (input == 3) {
            System.out.println("Tuesday");
        } else if (input == 4) {
            System.out.println("Wednesday");
        } else if (input == 5) {
            System.out.println("Thursday");
        } else if (input == 6) {
            System.out.println("Friday");
        } else if (input == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}
