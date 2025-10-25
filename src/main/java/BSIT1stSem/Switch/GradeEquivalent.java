package BSIT1stSem.Switch;

import java.util.*;

public class GradeEquivalent {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a grade letter (A, B, C, D, F): ");
            // Read the first character and convert to uppercase for case-insensitivity
            char grade = Character.toUpperCase(scanner.next().charAt(0));
            String remarks;

            remarks = switch (grade) {
                case 'A' ->
                    "Excellent";
                case 'B' ->
                    "Very Good";
                case 'C' ->
                    "Good";
                case 'D' ->
                    "Fair";
                case 'F' ->
                    "Failed";
                default ->
                    "Invalid grade letter.";
            };

            System.out.println("Remarks: " + remarks);
        }
    }
}
