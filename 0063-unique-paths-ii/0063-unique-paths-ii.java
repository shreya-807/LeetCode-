class Solution {
    public static int fn(int i, int j, int[][] dp, int[][] grid) {
        int up = 0;
        int left = 0;
        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (grid[i][j] == 1)
            return 0;

        //obstacle condition- 
        //if (grid[i][j] != 0) {
        up = fn(i - 1, j, dp, grid);
        left = fn(i, j - 1, dp, grid);
        // }

        dp[i][j] = up + left;
        return dp[i][j];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        // if first element is one
        if (obstacleGrid[0][0] == 1)
            return 0;

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        return fn(m - 1, n - 1, dp, obstacleGrid);
    }
}