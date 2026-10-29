class Solution {
    public static int fn(int i, int[] nums, int prev, int[][] dp) {
        int select = 0;
        if (i == nums.length)
            return 0;
        if (dp[i][prev + 1] != -100000)
            return dp[i][prev+1];

        int skip = fn(i + 1, nums, prev, dp);

        if (prev == -1 || nums[prev] < nums[i]) {
            select = 1 + fn(i + 1, nums, i, dp);
        }
        return dp[i][prev + 1] = Math.max(select, skip);
    }

    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -100000);
        }

        return fn(0, nums, -1, dp);
    }
}