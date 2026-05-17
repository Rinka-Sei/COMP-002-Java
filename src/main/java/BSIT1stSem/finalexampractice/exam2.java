/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSIT1stSem.finalexampractice;

import java.util.*;

// The Temperature Analyzer: Create a double[] representing temperatures for a week. 
// Find the maximum, minimum, and the average temperature using a single loop.
/**
 *
 * @author mj
 */
public class exam2 {

    public static void main(String[] args) {

        double[] temperatures = new double[7];
        int x = 0;
        double sum = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        Scanner scan = new Scanner(System.in);

        //enter all temp
        while (x < temperatures.length) {
            System.out.print("Enter Temperature: ");
            temperatures[x] = scan.nextDouble();
            if (temperatures[x] > max) {
                max = temperatures[x];
            }
            if (temperatures[x] < min) {
                min = temperatures[x];
            }
            sum += temperatures[x];

            x++;
        }
        double average = sum / temperatures.length;

        System.out.println("The Max Temp is: " + max);
        System.out.println("The Min Temp is: " + min);
        System.out.println("The Average Temp is: " + average);
    }
}
