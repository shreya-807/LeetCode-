class Solution {
    public static int fn(int[] nums, int i, int[] dp) {
        int ans = 0;
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return nums[0];
        }
        if (dp[i] != -1)
            return dp[i];
        int select = nums[i] + fn(nums, i - 2, dp);
        int skip = fn(nums, i - 1, dp);
        return dp[i] = Math.max(select, skip);

    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return fn(nums, nums.length - 1, dp);
    }
}