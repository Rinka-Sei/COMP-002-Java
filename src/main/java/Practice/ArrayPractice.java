package Practice;

import java.util.*;

/**
 *
 * @author mj
 */
public class ArrayPractice {

    public static String getOrdinalSuffix(int n) {
        if (n >= 11 && n <= 13) {
            return "th";
        }
        return switch (n % 10) {
            case 1 ->
                "st";
            case 2 ->
                "nd";
            case 3 ->
                "rd";
            default ->
                "th";
        };
    }

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int x;
            double sum = 0;
            // Lab 2 Part A. Average of 15 numbers

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Lab 2 Part A. Average of N numbers");
            System.out.print("Enter number of entries: ");
            x = scan.nextInt();

            // Data validation
            if (x <= 0) {
                System.err.println("Error: Number of entries must be greater than zero. Average cannot be calculated.");
                scan.close();
                return;
            }

            for (int i = 0; i < x; i++) {
                int sequence = i + 1;
                String suffix = getOrdinalSuffix(sequence);
                System.out.print("Enter the " + sequence + suffix + " number: ");
                sum += scan.nextDouble();
            }
            sum = sum / x;

            System.out.println("Your average is: " + sum);
        }
    }
}
