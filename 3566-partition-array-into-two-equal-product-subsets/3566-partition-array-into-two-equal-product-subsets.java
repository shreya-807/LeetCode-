class Solution {
    public static boolean fn(int[] nums, int i, long target) {
        if (i < 0) {
            return false;
        }
        long m = 1;
        if (m == target)
            return true;
        boolean select = fn(nums, i - 1, target / nums[i]);
        boolean skip = fn(nums, i - 1, target);

        return select || skip;

    }

    public boolean checkEqualPartitions(int[] nums, long target) {
        long mul = 1;
        for (int i = 0; i < nums.length; i++) {
            mul *= nums[i];
        }
        if (mul != target * target) {
            return false;
        }
        return fn(nums, nums.length - 1, target);

    }
}