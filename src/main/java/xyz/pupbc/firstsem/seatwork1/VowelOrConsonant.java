package xyz.pupbc.firstsem.seatwork1;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char input = scanner.next().charAt(0);

        if (Character.isLetter(input)) {
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'
                    || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Please enter a letter.");
        }
    }
}
