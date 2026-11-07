class Solution {
    public static boolean fn(int[] nums, int i, int sum, int[][] dp) {

        if (i < 0)
            return false;
        if (sum < 0)
            return false;
        if (sum == 0)
            return true;
        if (dp[i][sum] != -1)
            return dp[i][sum]==1;
        boolean select = fn(nums, i - 1, sum - nums[i], dp);
        boolean skip = fn(nums, i - 1, sum, dp);
        if (select || skip)
            dp[i][sum] = 1;
        else
            dp[i][sum] = 0;

        return select || skip;
    }

    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        if (total % 2 != 0) {
            return false;
        }
        int sum = total / 2;
        int[][] dp = new int[nums.length][sum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return fn(nums, nums.length - 1, sum, dp);

    }
}