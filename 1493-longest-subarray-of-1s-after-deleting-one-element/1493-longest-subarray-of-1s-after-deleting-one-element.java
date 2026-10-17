class Solution {
    public int longestSubarray(int[] nums) {
        int count0 = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                i++;

            } else if (nums[i] == 0) {
                count0++;
                i++;

            }
            if (count0 > 1) {
                if (nums[j] == 0) {
                    count0--;
                }
                j++;
            }
            ans = Math.max(ans, i - j);

        }
        return ans-1;
    }
}