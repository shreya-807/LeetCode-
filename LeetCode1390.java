//1390. Four Divisors

class Solution {
    public int sumFourDivisors(int[] nums) {
        int count = 0;
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            sum = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    count++;
                    sum += j;
                }
                if (count > 4)
                    break;
            }
            if (count == 4) {
                res.add(sum);
            }
        }
        int ans = 0;
        for (int i = 0; i < res.size(); i++) {
            ans += res.get(i);
        }
        return ans;
    }
}
