package Practice;

import java.util.*;

/**
 *
 * @author mj
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try (Scanner scan = new Scanner(System.in)) {
            double kilometer, meter, value;
            System.out.print("Enter cm: ");
            value = scan.nextDouble();
            meter = value / 100.0;
            kilometer = value / 100000.0;
            System.out.println("meters is: " + meter);
            System.out.println("kilometers is: " + kilometer);
        }
    }
}
