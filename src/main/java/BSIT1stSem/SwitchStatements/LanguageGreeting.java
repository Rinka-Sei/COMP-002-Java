/**
 * This class provides a greeting in a user-selected language.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The LanguageGreeting class is a simple Java program that prompts the user to enter a language
 * (English, Spanish, French, or Tagalog). It then uses a switch statement to provide the
 * appropriate greeting for the selected language. The input is case-insensitive.
 *
 * @author Jules
 * @version 1.0
 */
public class LanguageGreeting {

    /**
     * The main entry point of the program.
     * It takes a language as input from the user and uses a switch statement
     * to find the corresponding greeting.
     *
     * @param args The command line arguments (not used in this program).
     */
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
