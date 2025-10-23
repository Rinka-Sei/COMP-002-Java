package BSIT1stSem.Seatworks;

import java.util.Scanner;

public class MessageBasedOnInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("Hello World");
        } else if (input == 2) {
            System.out.println("I am Groot");
        } else if (input == 3) {
            System.out.println("To The Top");
        } else if (input == 4) {
            System.out.println("Where is the Horizon?");
        } else if (input == 5) {
            System.out.println("I don't know");
        } else if (input == 6) {
            System.out.println("Yeah, I will");
        } else {
            System.out.println("Invalid input");
        }
    }
}
