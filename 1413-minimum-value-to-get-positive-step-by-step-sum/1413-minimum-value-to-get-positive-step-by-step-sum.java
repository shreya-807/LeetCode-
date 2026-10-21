class Solution {
    public int minStartValue(int[] nums) {
        int ans = 0;
        int sum = 0;
        while (true) {
            sum = ans;
            int i = 0;
            for (i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum < 1) {
                    sum = 0;
                    break;
                }
            }
            if (i == nums.length) {
                if (ans == 0) {
                    return 1;
                }
                return ans;
            }
            ans++;

        }

    }
}