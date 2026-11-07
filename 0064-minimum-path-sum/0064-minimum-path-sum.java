class Solution {
    public static int fn(int[][] grid, int i, int j, int[][] dp) {
        int ans = 0;
        if (i == 0 && j == 0)
            return grid[i][j];
        if (i == 0)
            return grid[i][j] + fn(grid, i, j - 1, dp);
        if (j == 0)
            return grid[i][j] + fn(grid, i - 1, j, dp);
        if (dp[i][j] != -1)
            return dp[i][j];
        int left = grid[i][j] + fn(grid, i, j - 1, dp);
        int top = grid[i][j] + fn(grid, i - 1, j, dp);
        ans += Math.min(left, top);
        return dp[i][j] = ans;
    }

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return fn(grid, grid.length - 1, grid[0].length - 1, dp);
    }
}