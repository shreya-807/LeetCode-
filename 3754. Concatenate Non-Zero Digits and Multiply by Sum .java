//3754. Concatenate Non-Zero Digits and Multiply by Sum I
class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int x = 0;
        int d = 0;
        while (n > 0) {
            d = n % 10;
            if (d == 0)
                n/=10;
            else {
                x = x * 10 + d;
                sum = sum + d;n /= 10;
            }
            
        }
        int ans = 0;
        while (x > 0) {
            d = x % 10;
            ans = ans * 10 + d;
            x /= 10;
        }
        return (long) ans * sum;
    }
}
