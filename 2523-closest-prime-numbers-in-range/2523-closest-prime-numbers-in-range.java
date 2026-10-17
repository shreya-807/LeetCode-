class Solution {
    public boolean prime(int n) {
        if(n<2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (prime(i)) {
                arr.add(i);
            }
        }
        int ans = Integer.MAX_VALUE;
      
        for (int i = arr.size() - 1; i > 0; i--) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff <= ans) {
                ans = diff;
                res[0] = arr.get(i - 1);
                res[1] = arr.get(i);
            }
        }
        return res;
    }
}