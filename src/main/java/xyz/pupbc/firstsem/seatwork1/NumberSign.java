package xyz.pupbc.firstsem.seatwork1;

import java.util.Scanner;

public class NumberSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
