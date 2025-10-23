package Practice.Levenshtein_Distance;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList(
                "City of San Pedro",
                "City of San Fernando",
                "City of San Jose"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a City: ");
        String userInput = scanner.nextLine();

        int threshold = 2; // Allowable distance

        String selectedCity = FuzzyMatcher.findBestMatch(userInput, cityNames, threshold);

        if (selectedCity != null) {
            System.out.println("You selected: " + selectedCity);
        } else {
            System.out.println("No matching city found.");
        }

        scanner.close();
    }
}
