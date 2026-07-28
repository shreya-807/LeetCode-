class Solution {
    public double p(double x, long n) {
        n = Math.abs(n);
        double res = 0;
        if (n == 0) {
            return 1.0;
        }
        double half = p(x, n / 2);        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public double myPow(double x, int n) {
        double res = p(x, (long) n);
        if (n < 0)
            return 1.0 / res;
        return res;
    }
}