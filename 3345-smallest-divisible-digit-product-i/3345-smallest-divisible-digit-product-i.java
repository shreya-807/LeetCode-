class Solution {
    public int digitprod(int n) {
        int d = 0;

        int mul = 1;
        while (n > 0) {
            d = n % 10;
            mul *= d;
            n /= 10;
        }

        return mul;
    }
    public int smallestNumber(int n, int t) {
        while (digitprod(n) % t != 0) {
            n++;
        }
        return n;
    }
}