class Solution {
    public static int fn(int n, int[] arr, int[] dp) {
        if (n >= arr.length)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = arr[n] + Math.min(fn(n + 1, arr, dp), fn(n + 2, arr, dp));
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(fn(0, cost, dp), fn(1, cost, dp));
    }
}