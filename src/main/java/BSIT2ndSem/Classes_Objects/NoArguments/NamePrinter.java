package BSIT2ndSem.Classes_Objects.NoArguments;

import java.util.*;

public class NamePrinter {

    public void HelloName(Scanner sc) {
        System.out.print("\nPlease Enter your Name: ");
        String name = sc.nextLine();
        System.out.printf("Hi! %s%n", name);
    }
}
