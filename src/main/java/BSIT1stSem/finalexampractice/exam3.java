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
public class exam3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Balance = 20000.00, Withdrawal = 0.00;
        System.out.println("Login");
        System.out.println("""
                           ===========================================================
                                                    Welcome!!!
                           ===========================================================
                           
                           Enter your action:
                           B - Balance
                           D - Deposit
                           W - Withdraw
                           
                           E - Exit and Log Out
                           ===========================================================
                           """);
        char action = scan.next().charAt(0);

        while (Character.toUpperCase(action) != 'E') {
            switch (Character.toUpperCase(action)) {
                case 'B':
                    System.out.println("Showing Balance...");
                    System.out.println("Balance: " + Balance);
                    break;

                case 'D':
                    System.out.println("Deposit...");
                    System.out.println("Enter the Amount to Deposit: ");
                    Balance += scan.nextDouble();
                    break;
                case 'W':
                    System.out.println("Withdraw...");
                    System.out.println("Enter the Amount to Withdraw: ");
                    Withdrawal = scan.nextDouble();
                    if (Balance < Withdrawal) {
                        System.out.println("Invalid Amount!");
                    } else {
                        Balance -= Withdrawal;
                    }
                    break;
                case 'E':
                    break;
            }
            System.out.println("""
                           ===========================================================
                                                    Welcome!!!
                           ===========================================================
                           
                           Enter your action:
                           B - Balance
                           D - Deposit
                           W - Withdraw
                           
                           E - Exit and Log Out
                           ===========================================================
                           """);
            action = scan.next().charAt(0);
        }
        System.out.println("Logging Out!");
        scan.close();
    }
}
