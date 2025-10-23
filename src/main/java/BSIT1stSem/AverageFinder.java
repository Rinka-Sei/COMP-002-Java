package BSIT1stSem;

import java.util.*;

public class AverageFinder {

    public static void main(String[] args) {

        /*
        TODO:
        
        1. Use a Single Loop: Instead of separately taking input, summing, and printing, you can combine some of these operations.
        will do

        2. Input Validation: To improve robustness, consider checking for valid input.
        try-catch exception

        3. Dynamic Array Size: Allow the user to specify how many numbers they want to input rather than hardcoding it to 5.
        or create a counter in a while loop that will keep on asking the user until it breaks from user specific input similar to ctrl+c
         */         
        
        Scanner sc = new Scanner(System.in);
        double numbers[] = new double[5];
        double average, total;
        int i;

        i = 0;
        while (i < 5) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            i++;
        }
        sc.close();

        // for checking purposes
        for (double number : numbers) {
            System.out.println(number);
        }

        // sum of all numbers
        total = 0;
        for (double number : numbers) {
            total += number;
        }

        // calculate the average
        average = total / numbers.length;

        System.out.println("The average of the integers in the array is: " + average);
    }
}
