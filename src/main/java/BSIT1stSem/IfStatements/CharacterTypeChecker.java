package BSIT1stSem.IfStatements;

import java.util.*;

public class CharacterTypeChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a single character: ");
            char ch = scanner.next().charAt(0);
            String type;

            if (Character.isLetter(ch)) {
                type = "**Alphabet**";
            } else if (Character.isDigit(ch)) {
                type = "**Number**";
            } else {
                type = "**Special Character**";
            }

            System.out.println("The character is a(n) " + type + ".");
        }
    }
}
