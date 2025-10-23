package BSIT1stSem.Switch;

import java.util.*;

public class GradeEquivalent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a grade letter (A, B, C, D, F): ");
        // Read the first character and convert to uppercase for case-insensitivity
        char grade = Character.toUpperCase(scanner.next().charAt(0));
        String remarks;

        switch (grade) {
            case 'A':
                remarks = "Excellent";
                break;
            case 'B':
                remarks = "Very Good";
                break;
            case 'C':
                remarks = "Good";
                break;
            case 'D':
                remarks = "Fair";
                break;
            case 'F':
                remarks = "Failed";
                break;
            default:
                remarks = "Invalid grade letter.";
        }

        System.out.println("Remarks: " + remarks);
        scanner.close();
    }
}
