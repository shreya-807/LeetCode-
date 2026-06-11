//503. Next Greater Element II

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int count = nums.length;
        int c = 0;
        for (int i = 0; i < nums.length ; i++) {
            int val = nums[i];
            res[i] = -1;
            int j = i + 1;
            c = 0;
            while (c != count) {

                if (j >= nums.length) {
                    j = j % count;
                }
                if (val < nums[j]) {
                    res[i] = nums[j];
                    break;
                }
                j++;
                c++;
            }
        }

        return res;
    }
}
