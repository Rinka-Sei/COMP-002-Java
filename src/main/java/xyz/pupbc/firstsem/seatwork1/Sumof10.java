            package xyz.pupbc.firstsem.seatwork1;

import java.util.*;

public class Sumof10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[10];
        double sum = 0;

        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            sum += num[i];
            i++;
        }
        
        sc.close();
        System.out.println("The sum of 10 integers is: " + sum);

    }
}
