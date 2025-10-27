/**
 * This class provides the appropriate action based on a user-provided traffic light color.
 * This improved version separates the logic for getting the traffic light action into a separate method
 * for better testability and uses a Map for a more scalable and flexible implementation.
 */
package BSIT1stSem.SwitchStatements_improved;

import java.util.Map;
import java.util.Scanner;

/**
 * The TrafficLightAction_improved class prompts the user to enter a traffic light color and
 * displays the corresponding action. The core logic is encapsulated in a separate, easily
 * testable method.
 *
 * @author Jules
 * @version 1.1
 */
public class TrafficLightAction_improved {

    /**
     * A map that stores the mapping between traffic light colors and actions.
     */
    private static final Map<String, String> ACTION_MAP = Map.of(
            "red", "STOP",
            "yellow", "PREPARE TO STOP / CAUTION",
            "green", "GO"
    );

    /**
     * Gets the action for the provided traffic light color.
     *
     * @param color The color of the traffic light.
     * @return The corresponding action, or an error message if the color is not recognized.
     */
    public String getAction(String color) {
        return ACTION_MAP.getOrDefault(color.toLowerCase(), "Unknown color. Traffic light colors are Red, Yellow, Green.");
    }

    /**
     * The main entry point of the program.
     * It handles user input and output, and uses the getAction method to determine the result.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a color (red, yellow, green): ");
            String color = scanner.next();
            TrafficLightAction_improved trafficLight = new TrafficLightAction_improved();
            String instruction = trafficLight.getAction(color);
            System.out.println("Instruction: " + instruction);
        }
    }
}
