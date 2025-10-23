package BSIT1stSem.IfStatements;

import java.util.*;

public class CaseChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a character: ");
            char ch = scanner.next().charAt(0);

            // We first check if it is a letter before checking case
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    System.out.println(ch + " is an **Uppercase Letter**.");
                } else {
                    // Must be lowercase if it's a letter and not uppercase
                    System.out.println(ch + " is a **Lowercase Letter**.");
                }
            } else {
                System.out.println(ch + " is not an alphabet.");
            }
        }
    }
}
