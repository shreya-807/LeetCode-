class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        java.util.Arrays.fill(dp, -1);
        return solve(0, arr, k, dp);
    }

    private int solve(int i, int[] arr, int k, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) return dp[i];
        
        int maxAns = 0;
        int maxVal = 0;
        for (int j = i; j < arr.length && j < i + k; j++) {
            maxVal = Math.max(maxVal, arr[j]);
            int currentLength = j - i + 1;

            int currentSum = (maxVal * currentLength) + solve(j + 1, arr, k, dp);
            maxAns = Math.max(maxAns, currentSum);
        }

        return dp[i] = maxAns;
    }
}