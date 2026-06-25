//2587. Rearrange Array to Maximize Prefix Score
class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        long sum = nums[0];
        int score = 0;

        if (sum > 0)
            score++;

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum > 0) {
                score++;
            }
        }

        return score;

    }
}
