//209. Minimum Size Subarray Sum
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int res = 0;
        while (j < nums.length) {
            if (sum < target) {
                sum += nums[j];
                j++;
            }
            while (sum >= target) {
                sum -= nums[i];
                res = j - i;
                i++;
            }
        }
        if (res == 1)
            return res;

        i = 0;
        j = 0;
        sum = 0;
        int res1 = 0;
        while (j < nums.length) {
            if (sum < target) {
                sum += nums[j];
                j++;
            }
            while (sum >= target) {
                res1 = j - i;
                res = Math.min(res, res1);
                sum -= nums[i];
                i++;
            }
        }
        return res;
    }
}
