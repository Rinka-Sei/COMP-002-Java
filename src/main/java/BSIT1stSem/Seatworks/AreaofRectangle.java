package BSIT1stSem.Seatworks;

import java.util.*;

public class AreaofRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w, l, area;

        System.out.println("Enter width (in meters): ");
        w = sc.nextDouble();
        System.out.println("Enter length (in meters): ");
        l = sc.nextDouble();
        sc.close();

        area = w * l;

        System.out.println("The area is: " + area + " square meters");
        System.out.println("The area is: " + area * 10000 + " square centimeters");

    }
}
