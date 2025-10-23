/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.*;

/**
 *
 * @author mj
 *
 * Date: October, 07 2025
 *
 */
public class Lab {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double num1, num2, num3, degrees, revolutions, number1, number2, number3, number4, number5, number6, number7, number8, number9, number10, number11, number12, number13, number14, number15, cube, sum, average;
            // Lab 1 Part A. 3 nums output sum, diff, prod, quotient
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Lab 1 Part A. 3 nums output sum, diff, prod, quotient");
            System.out.print("Enter 1st number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter 2nd number: ");
            num2 = scan.nextDouble();
            System.out.print("Enter 3rd number: ");
            num3 = scan.nextDouble();
            System.out.println("Your sum is: " + (num1 + num2 + num3));
            System.out.println("Your difference is: " + (num1 - num2 - num3));
            System.out.println("Your product is: " + (num1 * num2 * num3));
            System.out.println("Your quotient is: " + (num1 / num2 / num3));
            // Lab 1 Part B. Raise the number to the 3rd power / Compute for a cube of a number
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Lab 1 Part B. Raise the number to the 3rd power / Compute for a cube of a number");
            cube = num1 * num1 * num1;
            System.out.println("The number " + num1 + ": Raised to the 3rd power is :" + cube);
            // Lab 2 Part A. Average of 15 numbers
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Lab 2 Part A. Average of 15 numbers");
            System.out.print("Enter 1st number: ");
            number1 = scan.nextDouble();
            System.out.print("Enter 2nd number: ");
            number2 = scan.nextDouble();
            System.out.print("Enter 3rd number: ");
            number3 = scan.nextDouble();
            System.out.print("Enter 4th number: ");
            number4 = scan.nextDouble();
            System.out.print("Enter 5th number: ");
            number5 = scan.nextDouble();
            System.out.print("Enter 6th number: ");
            number6 = scan.nextDouble();
            System.out.print("Enter 7th number: ");
            number7 = scan.nextDouble();
            System.out.print("Enter 8th number: ");
            number8 = scan.nextDouble();
            System.out.print("Enter 9th number: ");
            number9 = scan.nextDouble();
            System.out.print("Enter 10th number: ");
            number10 = scan.nextDouble();
            System.out.print("Enter 11th number: ");
            number11 = scan.nextDouble();
            System.out.print("Enter 12th number: ");
            number12 = scan.nextDouble();
            System.out.print("Enter 13th number: ");
            number13 = scan.nextDouble();
            System.out.print("Enter 14th number: ");
            number14 = scan.nextDouble();
            System.out.print("Enter 15th number: ");
            number15 = scan.nextDouble();
            sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10 + number11 + number12 + number13 + number14 + number15;
            average = sum / 15;
            System.out.println("Average: " + average);
            // Lab 2 Part B. Degrees to Revolution Converter
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Lab 2 Part B. Degrees to Revolution Converter");
            System.out.print("Enter Degrees: ");
            degrees = scan.nextDouble();
            revolutions = degrees / 360;
            System.out.println("Revolutions: " + revolutions);
        }
    }
}
