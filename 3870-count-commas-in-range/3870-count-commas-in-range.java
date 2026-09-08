class Solution {
    public int countCommas(int n) {
        int lb = 1000;
        int ub = 999999;
        if (n < lb)
            return 0;
        int count = 0;
        int i = n;
        if (n >= lb) {
            i = lb;
            while (i <= ub && i <= n) {
                count++;
                i++;
            }
            n = i;
        }
        // lb = 100000;
        // ub = 999999;
        // if (n >= lb) {
        //     i = lb;
        //     while (i <= ub && i <= n) {
        //         count++;
        //         i++;
        //     }

        // }
        return count;
    }
}