package programs;

import java.util.*;

class Main {

    static int[][][] dp;
    static int[] arr;
    static int n, K, total;

    static int solve(int i, int count, int k, int prevTaken) {
        if (count == n) return 0;
        if (i >= total) return Integer.MIN_VALUE;

        if (dp[i][count][k] != -1) return dp[i][count][k];

        int notTake = solve(i + 1, count, k, 0);

        int take = Integer.MIN_VALUE;

        if (prevTaken == 0) {
            take = arr[i] + solve(i + 1, count + 1, k, 1);
        } else if (k > 0) {
            take = arr[i] + solve(i + 1, count + 1, k - 1, 1);
        }

        return dp[i][count][k] = Math.max(take, notTake);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        K = sc.nextInt();

        total = 3 * n;
        arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }

        dp = new int[total][n + 1][K + 1];
        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, -1);

        int case1 = solve(0, 0, K, 0);

        int[] newArr = new int[total - 1];
        for (int i = 1; i < total; i++) {
            newArr[i - 1] = arr[i];
        }

        arr = newArr;
        total = arr.length;

        dp = new int[total][n + 1][K + 1];
        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, -1);

        int case2 = solve(0, 0, K, 0);

        System.out.println(Math.max(case1, case2));
    }
}