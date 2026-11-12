class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int l = 1;
        int i = 0;
        int j = 0;

        // //        check for monotone inc-
        // int count = 1;
        // for (i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] < nums[i + 1]) {
        //         count++;
        //     }
        //     if (count == nums.length)
        //         return nums.length;
        // }
        // count = 1;
        // for (i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] > nums[i + 1]) {
        //         count++;
        //     }
        //     if (count == nums.length)
        //         return nums.length;
        // }

        for (i = 0; i < nums.length; i++) {
            for (j = i; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    continue;
                } else {

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
                    break;
                }
            }
            l = Math.max(l, j - i + 1);
        }
        return l;
    }
}