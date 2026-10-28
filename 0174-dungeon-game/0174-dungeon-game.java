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
            if (dungeon[i][j] < 0)
                return 1 + Math.abs(dungeon[i][j]);
            else
                return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int right = fn(i, j + 1, dungeon, dp);
        int down = fn(i + 1, j, dungeon, dp);
        int temp = Math.min(right, down) - dungeon[i][j];
        if (temp <= 0) {
            return dp[i][j] = 1;
        } else {
            return dp[i][j] = temp;
        }
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for (int[] r : dp) {
            Arrays.fill(r, -1);
        }
        return fn(0, 0, dungeon, dp);
    }
}