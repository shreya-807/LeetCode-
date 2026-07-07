//152. Maximum Product Subarray
class Solution {
    public int maxProduct(int[] nums) {
        int maxp = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxp = Math.max(maxp, nums[i]);
        }
        int m = 1;
        for (int i = 0; i < nums.length; i++) {
            m = 1;
            for (int j = i; j < nums.length; j++) {
                m = m * nums[j];
                maxp = Math.max(maxp, m);
            }
        }
        return maxp;
    }
}
