package BSIT1stSem.IfStatements;

import java.util.*;

public class PasswordValidator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final String CORRECT_PASSWORD = "admin123";

            System.out.print("Input password: ");
            String password = scanner.nextLine();

            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("**Access Granted**");
            } else {
                System.out.println("**Access Denied**");
            }
        }
    }
}
