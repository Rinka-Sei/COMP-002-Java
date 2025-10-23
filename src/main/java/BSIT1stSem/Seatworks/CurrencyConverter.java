package BSIT1stSem.Seatworks;

import java.util.*;

public class CurrencyConverter {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter PHP: ");
            double Pesos = sc.nextInt();
            double Dollars = Pesos / 57;
            System.out.println("Your money in Dollars is: $" + Dollars);
        }
    }
}
