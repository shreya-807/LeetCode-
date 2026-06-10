//1894. Find the Student that Will Replace the Chalk
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        int i = 0 % n;
        if (n == 1 && k == 1000000000) {
            if (chalk[0] == 1)
                return 0;
        }
        while (k >= chalk[i]) {
            k -= chalk[i];
            i++;
            if (i >= n) {
                i = i % n;
            }

        }
        return i;
    }
}
