package Levenshtein_Distance;

import java.util.ArrayList;
import java.util.List;

public class FuzzyMatcher {

    public static String findBestMatch(String input, List<String> candidates, int threshold) {
        String bestMatch = null;
        int bestDistance = Integer.MAX_VALUE;

        // Split the input into words for keyword matching
        String[] keywords = input.toLowerCase().split("\\s+");

        for (String candidate : candidates) {
            // Check if all keywords are present in the candidate string
            boolean allKeywordsPresent = true;
            for (String keyword : keywords) {
                if (!candidate.toLowerCase().contains(keyword)) {
                    allKeywordsPresent = false;
                    break;
                }
            }

            // If all keywords are present, check the Levenshtein distance
            if (allKeywordsPresent) {
                int distance = LevenshteinDistance.calculate(input.toLowerCase(), candidate.toLowerCase());
                if (distance < bestDistance && distance <= threshold) {
                    bestDistance = distance;
                    bestMatch = candidate;
                }
            }
        }
        return bestMatch;
    }
}
