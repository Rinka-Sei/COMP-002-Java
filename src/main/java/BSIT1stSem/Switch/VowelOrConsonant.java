package BSIT1stSem.Switch;

import java.util.*;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a single character: ");
        char ch = Character.toLowerCase(scanner.next().charAt(0)); // Convert to lowercase

        if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a **Vowel**.");
                    break;
                default:
                    System.out.println(ch + " is a **Consonant**.");
            }
        } else {
            System.out.println("Input is not a letter.");
        }

        scanner.close();
    }
}
