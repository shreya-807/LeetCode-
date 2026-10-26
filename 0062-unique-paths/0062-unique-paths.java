class Solution {
    public static int fn(int[][] dp, int i, int j) {
        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != 0)
            return dp[i][j];

        int left = fn(dp, i, j - 1);
        int up = fn(dp, i - 1, j);
        dp[i][j] = left + up;
        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        return fn(dp, m-1, n-1);
    }
}