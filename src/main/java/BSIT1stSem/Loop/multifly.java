/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSIT1stSem.Loop;

import java.util.*;

public class multifly {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find the 1st 10 Multiples");
        int n = scan.nextInt();

        for (int x = 1; x < 11; x++) {
            System.out.println(n + " * " + x + " = " + (n * x));
        }
    }
}
