package BSIT1stSem.Switch;

import java.util.*;

public class TrafficLightAction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a color (red, yellow, green): ");
        // Read the string and convert to lowercase for case-insensitivity
        String color = scanner.next().toLowerCase();
        String instruction;

        switch (color) {
            case "red":
                instruction = "STOP";
                break;
            case "yellow":
                instruction = "PREPARE TO STOP / CAUTION";
                break;
            case "green":
                instruction = "GO";
                break;
            default:
                instruction = "Unknown color. Traffic light colors are Red, Yellow, Green.";
        }

        System.out.println("Instruction: " + instruction);
        scanner.close();
    }
}
