package xyz.mj.almeda;

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
