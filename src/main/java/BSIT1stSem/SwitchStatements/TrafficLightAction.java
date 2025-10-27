/**
 * This class provides the appropriate action based on a user-provided traffic light color.
 */
package BSIT1stSem.SwitchStatements;

import java.util.*;

/**
 * The TrafficLightAction class prompts the user to enter a traffic light color (red, yellow, or green).
 * It then uses a switch statement to determine the corresponding action (e.g., "STOP" for red).
 * The input is case-insensitive.
 *
 * @author Jules
 * @version 1.0
 */
public class TrafficLightAction {

    /**
     * The main entry point of the program.
     * It takes a color as input from the user and uses a switch statement to find the
     * corresponding traffic light instruction.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a color (red, yellow, green): ");
            // Read the string and convert to lowercase for case-insensitivity
            String color = scanner.next().toLowerCase();
            String instruction;

            instruction = switch (color) {
                case "red" ->
                    "STOP";
                case "yellow" ->
                    "PREPARE TO STOP / CAUTION";
                case "green" ->
                    "GO";
                default ->
                    "Unknown color. Traffic light colors are Red, Yellow, Green.";
            };

            System.out.println("Instruction: " + instruction);
        }
    }
}
