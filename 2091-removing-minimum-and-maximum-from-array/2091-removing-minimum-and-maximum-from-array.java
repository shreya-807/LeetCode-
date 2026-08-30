class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int maxind = 0;
        int minind = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                maxind = i;
                max = nums[i];
            }  if (nums[i] < min) {
                minind = i;
                min = nums[i];
            }
        }
        int i = 0;
        int res1 = 1;
        while (i != Math.max(minind, maxind)) {
            res1++;
            i++;
        }
        int res2 = 1;
        i = n - 1;
        while (i != Math.min(minind, maxind)) {
            res2++;
            i--;
        }
        int res3 = Math.min(minind, maxind) + 1 + n - Math.max(minind, maxind);
        int res = Math.min(res1, Math.min(res2, res3));
        return res;
    }
}