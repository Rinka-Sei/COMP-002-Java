package BSIT1stSem.IfStatements;

import java.util.*;

public class StringComparison {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the first string: ");
            String str1 = scanner.nextLine();
            System.out.print("Input the second string: ");
            String str2 = scanner.nextLine();

            // Use .equals() for proper String content comparison
            if (str1.equals(str2)) {
                System.out.println("The two strings are **equal**.");
            } else {
                System.out.println("The two strings are **not equal**.");
            }
        }
    }
}
