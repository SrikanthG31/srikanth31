package programs;

import java.util.*;

public class PizzaWith3nSlices {

    static int NEG = -1000000000;

    public static int maxSizeSlices(int[] slices, int K) {
        int m = slices.length;
        int n = m / 3;

        // Case 1: First slice NOT taken
        int case1 = solve(slices, K, false);

        // Case 2: First slice TAKEN
        int case2 = solve(slices, K, true);

        return Math.max(case1, case2);
    }

    private static int solve(int[] slices, int K, boolean takeFirst) {
        int m = slices.length;
        int n = m / 3;

        // dp[i][j][k][prev]
        int[][][][] dp = new int[m][n + 1][K + 2][2];

        for (int i = 0; i < m; i++)
            for (int j = 0; j <= n; j++)
                for (int k = 0; k <= K; k++)
                    Arrays.fill(dp[i][j][k], NEG);

        // Initialization
        if (takeFirst) {
            dp[0][1][0][1] = slices[0];
        } else {
            dp[0][0][0][0] = 0;
        }

        // DP transitions
        for (int i = 1; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= K; k++) {

                    // Not take current slice
                    dp[i][j][k][0] = Math.max(dp[i][j][k][0],
                            Math.max(dp[i - 1][j][k][0], dp[i - 1][j][k][1]));

                    // Take current slice
                    if (j > 0) {
                        // If previous NOT taken
                        if (dp[i - 1][j - 1][k][0] != NEG) {
                            dp[i][j][k][1] = Math.max(dp[i][j][k][1],
                                    dp[i - 1][j - 1][k][0] + slices[i]);
                        }

                        // If previous taken → adjacency cost
                        if (k > 0 && dp[i - 1][j - 1][k - 1][1] != NEG) {
                            dp[i][j][k][1] = Math.max(dp[i][j][k][1],
                                    dp[i - 1][j - 1][k - 1][1] + slices[i]);
                        }
                    }
                }
            }
        }

        int ans = 0;

        // Final answer extraction
        for (int k = 0; k <= K; k++) {
            // Last NOT taken
            ans = Math.max(ans, dp[m - 1][n][k][0]);

            // Last taken
            if (takeFirst) {
                // circular adjacency (last & first)
                if (k + 1 <= K) {
                    ans = Math.max(ans, dp[m - 1][n][k][1]);
                }
            } else {
                ans = Math.max(ans, dp[m - 1][n][k][1]);
            }
        }

        return ans;
    }

    // Driver
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of slices to pick
        int K = sc.nextInt();   // max adjacency tokens

        int[] slices = new int[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            slices[i] = sc.nextInt();
        }

        System.out.println(maxSizeSlices(slices, K));
    }
}