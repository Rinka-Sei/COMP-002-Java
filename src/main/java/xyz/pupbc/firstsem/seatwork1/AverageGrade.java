package xyz.pupbc.firstsem.seatwork1;

import java.util.*;

public class AverageGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prelims, midterms, finals, total, ave;

        System.out.println("Grade in Prelims:");
        prelims = sc.nextDouble();
        System.out.println("Grade in Midterms: ");
        midterms = sc.nextDouble();
        System.out.println("Grade in Finals: ");
        finals = sc.nextDouble();

        total = prelims + midterms + finals;
        ave = total / 3;

        System.out.println("Your average is: " + ave);
        sc.close();
    }

}
