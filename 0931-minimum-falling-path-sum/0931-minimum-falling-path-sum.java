class Solution {
    public static int fn(int m, int n, int[][] dp, int[][] matrix) {
        int i = matrix.length;
        int j = matrix[0].length;
        if (n < 0 || n >= j)
            return (int) 1e9;
        if (m == i - 1)
            return matrix[m][n];
            if (dp[m][n] != -101)
            return dp[m][n];
        int down = matrix[m][n] + fn(m + 1, n, dp, matrix);
        int leftd = matrix[m][n] + fn(m + 1, n - 1, dp, matrix);
        int rightd = matrix[m][n] + fn(m + 1, n + 1, dp, matrix);
        
        dp[m][n] = Math.min(down, Math.min(leftd, rightd));
        return dp[m][n];
    }

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int[] r : dp) {
            Arrays.fill(r, -101);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, fn(0, i, dp, matrix));
        }
        return ans;
    }
}