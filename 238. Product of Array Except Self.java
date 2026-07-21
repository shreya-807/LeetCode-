class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int count0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count0++;
        }
        if (count0 > 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                mul *= nums[i];
        }
        if (count0 == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    nums[i] = mul;
                else
                    nums[i] = 0;
            }
            return nums;
        } else
            for (int i = 0; i < nums.length; i++) {
                nums[i] = mul / nums[i];
            }
        return nums;
    }
}
