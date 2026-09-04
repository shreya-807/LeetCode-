class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int minval = Integer.MAX_VALUE;
            int maxval = Integer.MIN_VALUE;
            for (int j = i ; j < nums.length; j++) {
                minval = Math.min(nums[j], minval);
            }
            for(int p=0;p<=i;p++){
                maxval= Math.max(maxval,nums[p]);
            }
            if(maxval-minval<=k)
            return i;
        }return -1;
    }
}
