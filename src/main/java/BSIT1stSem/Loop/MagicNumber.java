package BSIT1stSem.Loop;

import java.util.*;

/**
 *
 * @author mj
 */
public class MagicNumber {

    public static void main(String[] args) {
        int i = 22;
        while (i != 22) {
            System.out.println("Guess the Magic Number: ");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
        }
        System.out.println("You did it Nigga!");
    }
}
