class Solution {

    static int[] dp;

    public int help(int n) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int ans = help(n - 1) + help(n - 2);
        dp[n] = ans;
        return ans;
    }

    public int fib(int n) {
        dp = new int[n + 1];
        return help(n);
    }
}