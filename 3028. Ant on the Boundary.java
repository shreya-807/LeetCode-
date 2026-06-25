//3028. Ant on the Boundary
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int[] prefixsum = new int[nums.length];
        prefixsum[0] = nums[0];
        int sum = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            prefixsum[i] = sum;
            if (prefixsum[i] == 0)
                count++;
        }
        return count;
    }
}
