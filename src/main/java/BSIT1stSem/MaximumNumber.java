package BSIT1stSem;

import java.util.*;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int numbers[] = new int[7];

        i = 0;
        while (i < 7) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        }
        sc.close();

        // for checking purposes
        for (int number : numbers) {
            System.out.println(number);
        }

        int max = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int min = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The Largest number in the array is: " + max);
        System.out.println("The Smallest number in the array is: " + min);

    }
}
