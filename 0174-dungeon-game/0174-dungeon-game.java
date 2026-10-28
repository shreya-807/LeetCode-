class Solution {
    public static int fn(int i, int j, int[][] dungeon, int[][] dp) {
        int r = dungeon.length;
        int c = dungeon[0].length;

        if (i >= r || j >= c) // out of bound
        {
            return Integer.MAX_VALUE;
        }
        if (i == r - 1 && j == c - 1) //reached
        {
            return Math.max(1, (1 - dungeon[i][j]));
        }
        if (dp[i][j] != -10001) {
            return dp[i][j];
        }
        int right = fn(i, j + 1, dungeon, dp);
        int down = fn(i + 1, j, dungeon, dp);
        return dp[i][j] = Math.max(1, Math.min(right, down) - dungeon[i][j]);
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for (int[] r : dp) {
            Arrays.fill(r, -10001);
        }
        return fn(0, 0, dungeon, dp);
    }
}