class Solution {
    private int helper(int[] nums, int target, int index, int currentSum) {
        if (index == nums.length) {
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int add = helper(nums, target, index + 1, currentSum + nums[index]);
        int subtract = helper(nums, target, index + 1, currentSum - nums[index]);

        return add + subtract;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }
}