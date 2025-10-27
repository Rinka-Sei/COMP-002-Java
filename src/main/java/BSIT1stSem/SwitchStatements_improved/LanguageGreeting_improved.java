/**
 * This class provides a greeting in a user-selected language.
 * This improved version separates the logic for getting the greeting into a separate method
 * for better testability and uses a Map for a more scalable and flexible implementation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Map;
import java.util.Scanner;

/**
 * The LanguageGreeting_improved class prompts the user to enter a language and displays
 * the corresponding greeting. The core logic is encapsulated in a separate, easily testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class LanguageGreeting_improved {

    /**
     * A map that stores the mapping between languages and greetings.
     */
    private static final Map<String, String> GREETING_MAP = Map.of(
            "english", "Hello",
            "spanish", "Hola",
            "french", "Bonjour",
            "tagalog", "Kamusta"
    );

    /**
     * Gets the greeting for the provided language.
     *
     * @param language The language for which to get the greeting.
     * @return The corresponding greeting, or an error message if the language is not recognized.
     */
    public String getGreeting(String language) {
        return GREETING_MAP.getOrDefault(language.toLowerCase(), "Language not recognized. Cannot provide a custom greeting.");
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getGreeting method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a language (English, Spanish, French, Tagalog): ");
            String language = scanner.next();
            LanguageGreeting_improved greeter = new LanguageGreeting_improved();
            String greeting = greeter.getGreeting(language);
            System.out.println("Greeting: " + greeting);
        }
    }
}
