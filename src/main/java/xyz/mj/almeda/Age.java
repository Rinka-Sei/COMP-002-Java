/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.mj.almeda;

import java.util.*;

public class Age {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int birthyear, age;
        String name;

        // Asking for Personal Info
        System.out.print("Enter your Name: ");
        name = scan.nextLine();
        System.out.print("Enter Age: ");
        age = scan.nextInt();
        System.out.println(name + " your age is " + age);

        // Age moderation
        if (age < 18) {
            System.out.println("You are too young in this world!");
        } else {
            System.out.println("Go on");
        }
        // Birthyear Identifier
        birthyear = 2025 - age;

        System.out.println("You are born in: " + birthyear);
    }
}
