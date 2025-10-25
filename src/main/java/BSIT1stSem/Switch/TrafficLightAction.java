package BSIT1stSem.Switch;

import java.util.*;

public class TrafficLightAction {

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
