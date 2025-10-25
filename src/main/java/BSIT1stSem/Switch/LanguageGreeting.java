package BSIT1stSem.Switch;

import java.util.*;

public class LanguageGreeting {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a language (English, Spanish, French, Tagalog): ");
            // Read and convert to lowercase for case-insensitivity
            String language = scanner.next().toLowerCase();
            String greeting;

            greeting = switch (language) {
                case "english" ->
                    "Hello";
                case "spanish" ->
                    "Hola";
                case "french" ->
                    "Bonjour";
                case "tagalog" ->
                    "Kamusta";
                default ->
                    "Language not recognized. Cannot provide a custom greeting.";
            };

            System.out.println("Greeting: " + greeting);
        }
    }
}
