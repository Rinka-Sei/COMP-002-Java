package BSIT1stSem.IfStatements;

import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input age: ");
            int age = scanner.nextInt();
            String category;

            if (age < 0) {
                category = "Invalid Age";
            } else if (age < 13) {
                category = "**Child** (<13)";
            } else if (age <= 19) { // 13-19
                category = "**Teen** (13–19)";
            } else if (age <= 59) { // 20-59
                category = "**Adult** (20–59)";
            } else { // 60+
                category = "**Senior** (60+)";
            }

            System.out.println("Age Category: " + category);
        }
    }
}
