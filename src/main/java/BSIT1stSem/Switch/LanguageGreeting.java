package BSIT1stSem.Switch;

import java.util.*;

public class LanguageGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a language (English, Spanish, French, Tagalog): ");
        // Read and convert to lowercase for case-insensitivity
        String language = scanner.next().toLowerCase();
        String greeting;

        switch (language) {
            case "english":
                greeting = "Hello";
                break;
            case "spanish":
                greeting = "Hola";
                break;
            case "french":
                greeting = "Bonjour";
                break;
            case "tagalog":
                greeting = "Kamusta";
                break;
            default:
                greeting = "Language not recognized. Cannot provide a custom greeting.";
        }

        System.out.println("Greeting: " + greeting);
        scanner.close();
    }
}
