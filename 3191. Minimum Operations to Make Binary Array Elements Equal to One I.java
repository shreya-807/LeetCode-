//3191. Minimum Operations to Make Binary Array Elements Equal to One I
class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int i = 0;
        int j = i + 2;
        while (j < nums.length) {
            if (nums[i] == 0) {
                for (int k = i; k <= j; k++) {
                    if (nums[k] == 1)
                        nums[k] = 0;
                    else
                        nums[k] = 1;
                }
                count++;
            }
            i++;
            j++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                return -1;
        }
        return count;
    }
}
