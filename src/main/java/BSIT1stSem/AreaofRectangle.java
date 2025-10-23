/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSIT1stSem;

import java.util.*;

/**
 *
 * @author mj
 */
public class AreaofRectangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length, width, area;

        System.out.println("enter length: ");
        length = scan.nextDouble();

        System.out.println("Enter width: ");
        width = scan.nextDouble();

        area = length * width;

        System.out.println("The area is :" + area + " square units");

    }
}
