/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSIT1stSem.finalexampractice;

import java.util.*;

/**
 *
 * @author mj
 */
public class exam1 {

    public static void main(String[] args) { // Note: I added the main method wrapper so the code sits inside a valid block
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Amount of Numbers in an Array: ");
        int NumSize = scan.nextInt();
        int[] nums = new int[NumSize];

        int x = 0;
        while (x < NumSize) {
            System.out.println("Enter the number: ");
            nums[x] = scan.nextInt();
            x++;
        }

        // odd even splitter
        int oddCount = 0;

        System.out.println("Checking numbers");
        for (int numbers : nums) {
            if (numbers % 2 == 0) {
                System.out.println(numbers + " is Even");
            } else {
                System.out.println(numbers + " is Odd");
                oddCount += 1;
            }
        }

        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + (NumSize - oddCount));
        int[] oddNums = new int[oddCount];
        int[] evenNums = new int[NumSize - oddCount];

        int oddIndex = 0, evenIndex = 0;
        for (int numbers : nums) {
            if (numbers % 2 == 0) {
                evenNums[evenIndex] = numbers;
                evenIndex++;
            } else {
                oddNums[oddIndex] = numbers;
                oddIndex++;
            }
        }
        System.out.print("The Odd Numbers are: ");
        for (int odds : oddNums) {
            System.out.print(odds + " ");
        }
        System.out.println("");
        System.out.print("The Even Numbers are: ");
        for (int evens : evenNums) {
            System.out.print(evens + " ");
        }

        scan.close();
    }
}
