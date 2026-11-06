class Solution {
    public static int fn1(int[] nums, int i, int[] dp) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return nums[0];
        }
        if (dp[i] != -1)
            return dp[i];

        int select = nums[i] + fn1(nums, i - 2, dp);
        int skip = fn1(nums, i - 1, dp);
        return dp[i] = Math.max(select, skip);
    }

    public static int fn2(int[] nums, int i, int[] dp2) {
        if (i < 1)
            return 0;
        if (i == 1) {
            return nums[1];
        }
        if (dp2[i] != -1)
            return dp2[i];
        int select = nums[i] + fn2(nums, i - 2, dp2);
        int skip = fn2(nums, i - 1, dp2);
        return dp2[i] = Math.max(select, skip);

    }

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
         int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        return Math.max(fn1(nums, nums.length - 2, dp), fn2(nums, nums.length - 1, dp2));

    }
}