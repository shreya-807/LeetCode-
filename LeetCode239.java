import java.util.ArrayList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> answer = new ArrayList<>();
        int res = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < k; i++) {
            res = Math.max(res, nums[i]);
        }
        for (int i = 0; i < k; i++) {
            if (nums[i] == res) {
                index = i;
                break;
            }
        }
        answer.add(res);

        int left = 1;
        int right = k;

        while (right <= nums.length - 1) {
            if (index < left) {
                res = Integer.MIN_VALUE;
                for (int i = left; i <= right; i++) {
                    if (nums[i] >= res) {
                        res = nums[i];
                        index = i;
                    }
                }
                answer.add(res);
                left++;
                right++;
            } else if (nums[right] > res) {
                res = nums[right];
                answer.add(res);
                index = right;
                left++;
                right++;
            } else {
                answer.add(res);
                left++;
                right++;
            }
        }

        int[] array = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            array[i] = answer.get(i);
        }
        return array;
    }
}
