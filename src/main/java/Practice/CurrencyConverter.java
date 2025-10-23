package Practice;

import java.util.*;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PHP: ");
        double Pesos = sc.nextInt();
        double Dollars = Pesos / 57;
        System.out.println("Your money in Dollars is: $" + Dollars);

    }
}
