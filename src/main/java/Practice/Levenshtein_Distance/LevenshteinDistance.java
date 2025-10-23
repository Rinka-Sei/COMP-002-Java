package Practice.Levenshtein_Distance;

public class LevenshteinDistance {

    public static int calculate(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        int[][] dp = new int[lenS1 + 1][lenS2 + 1];

        // Initialize the DP table
        for (int i = 0; i <= lenS1; i++) {
            dp[i][0] = i; // Deletion
        }
        for (int j = 0; j <= lenS2; j++) {
            dp[0][j] = j; // Insertion
        }

        // Compute the DP table
        for (int i = 1; i <= lenS1; i++) {
            for (int j = 1; j <= lenS2; j++) {
                int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1; // Substitution
                dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
            }
        }
        return dp[lenS1][lenS2];
    }
}
