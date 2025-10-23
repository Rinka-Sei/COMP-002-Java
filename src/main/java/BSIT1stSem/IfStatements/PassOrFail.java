package BSIT1stSem.IfStatements;

import java.util.*;

public class PassOrFail {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the student's grade: ");
            double grade = scanner.nextDouble();
            String result;

            // Condition: >= 75 is Pass, < 75 is Fail
            if (grade >= 75.0) {
                result = "**Pass**";
            } else {
                result = "**Fail**";
            }

            System.out.println("Result: " + result);
        }
    }
}
