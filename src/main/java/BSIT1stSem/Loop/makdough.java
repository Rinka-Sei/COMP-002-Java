/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSIT1stSem.Loop;

import java.util.*;

/**
 *
 * @author mj
 */
public class makdough {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            System.out.println("""
                           Select your Food:
                           1. Adobong Milktea
                           2. Ginataang Pasta
                           3. Sinigang na Pusit
                           4. Exit
                           """);
            x = scan.nextInt();
        } while (x != 4);
    }
}
