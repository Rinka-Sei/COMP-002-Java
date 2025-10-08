package xyz.pupbc.firstsem.seatwork1;

import java.util.*;

public class CountryCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("=   Characters to Country   =");
        System.out.println("=============================");
        System.out.print("   Enter a Character from A-Z: ");
        String input = sc.next();
        sc.close();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] countries = {"Africa", "Brazil", "China", "Denmark", "England", "France", "Germany", "Haiti", "India", "Japan", "Kazakhstan", "Laos", "Mexico", "Nigeria", "Oman", "Philippines", "Qatar", "Russia", "Spain", "Thailand", "Uganda", "Venezuela", "Wales", "No Country for Letter X", "Yemen", "Zambia"};

        // Input Validation and Error Handling
        if (input.length() == 1 && alphabet.contains(input.toLowerCase())) {
            char character = input.toLowerCase().charAt(0);

            if (character == 'x') {
                System.err.println("Country is No Country for Letter X");
            } else {
                System.out.println("Country is " + countries[alphabet.indexOf(character)]);
            }
        } else {
            System.err.println("Invalid input. Please enter a single character from A-Z.");
        }
    }
}
