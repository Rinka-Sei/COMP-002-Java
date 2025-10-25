package BSIT1stSem.Switch;

import java.util.*;

public class VowelOrConsonant {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a single character: ");
            char ch = Character.toLowerCase(scanner.next().charAt(0)); // Convert to lowercase

            if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' ->
                        System.out.println(ch + " is a **Vowel**.");
                    default ->
                        System.out.println(ch + " is a **Consonant**.");
                }
            } else {
                System.out.println("Input is not a letter.");
            }
        }
    }
}
