package xyz.pupbc.firstsem.practice;

import java.util.*;

public class CountEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, evenNumbers;

        int numbers[] = new int[10];
        evenNumbers = 0;
        i = 0;

        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        }
        sc.close();

        // for checking purposes
        for (int number : numbers) {
            System.out.println(number);
        }

        // My Approach
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers += 1;
            }
        }

        // For-each loop apporoach
        /*
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers += 1;
                }
            }
         */
        System.out.println("Total number of even numbers: " + evenNumbers);

    }
}
