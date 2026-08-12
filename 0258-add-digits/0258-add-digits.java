class Solution {
    public int addDigits(int n) {
        int ans = n;
        while (ans > 9) {
            if (ans / 10 == 0) {
                return ans;
            } else
                ans = ans % 10 + addDigits(ans / 10);
        }
        return ans;
    }
}