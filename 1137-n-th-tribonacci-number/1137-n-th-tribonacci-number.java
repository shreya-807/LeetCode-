class Solution {
    static int[] dp;

    public int fn(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        if (dp[n] != 0) {
            return dp[n];
        }
        int ans = fn(n - 1) + fn(n - 2) + fn(n - 3);
        dp[n] = ans;
        return ans;
    }

    public int tribonacci(int n) {
        dp = new int[n + 1];
        return fn(n);
    }
}

// class Solution {

//     static int[] dp;

//     public int help(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         if (dp[n] != 0) {
//             return dp[n];
//         }
//         int ans = help(n - 1) + help(n - 2);
//         dp[n] = ans;
//         return ans;
//     }

//     public int fib(int n) {
//         dp = new int[n + 1];
//         return help(n);
//     }
// }