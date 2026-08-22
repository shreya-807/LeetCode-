class Solution {
    public boolean checkDivisibility(int n) {
        int ds = 0;
        int x = n;
        int ms = 1;
        while (x > 0) {
            int d = x % 10;
            ds += d;
            ms *= d;
            x /= 10;
        }
        if (n % (ds + ms) == 0) {
            return true;
        }
        return false;
    }
}