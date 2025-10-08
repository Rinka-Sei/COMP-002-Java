package xyz.pupbc.firstsem.seatwork1;

import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("teen");
        } else {
            System.out.println("adult");
        }
    }
}
