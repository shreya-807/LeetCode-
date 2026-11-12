class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int l = 1;
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    continue;
                } else {
                    l = Math.max(l, j - i + 1);
                    break;
                }
            }
            l = Math.max(l, j - i + 1);
        }
        for (i = 0; i < nums.length; i++) {
            for (j = i; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    continue;
                } else {
                    l = Math.max(l, j - i + 1);
                    break;
                }
            }
            l = Math.max(l, j - i + 1);
        }
        return l;
    }
}