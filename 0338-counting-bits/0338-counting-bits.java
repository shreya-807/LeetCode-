class Solution {
    public int num1(int n) {
        int count = 0;
        if (n == 0)
            return 0;
        else
            return num1(n / 2) + n % 2;
        }

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = num1(i);
        }
        return res;
    }
}