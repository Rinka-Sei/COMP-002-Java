package xyz.mj.almeda;

import java.util.*;

public class Average_calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // average of 5 numbers
        double num1, num2, num3, num4, num5, average;

        // 
        System.out.print("Enter Number 1: ");
        num1 = scan.nextDouble();

        System.out.print("Enter Number 2: ");
        num2 = scan.nextDouble();

        System.out.print("Enter Number 3: ");
        num3 = scan.nextDouble();

        System.out.print("Enter Number 4: ");
        num4 = scan.nextDouble();

        System.out.print("Enter Number 5: ");
        num5 = scan.nextDouble();

        // Use PEMDAS Rule
        average = (num1 + num2 + num3 + num4 + num5) / 5;    //average = sum / 5;

        System.out.println("Your average is : " + average);

        scan.close();
    }
}
