class Solution {
    public int num1(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1)
                count++;
            n = n / 2;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = num1(i);
        }
        return res;
    }
}