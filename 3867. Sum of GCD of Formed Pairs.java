//3867. Sum of GCD of Formed Pairs
class Solution {
    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int[] mx = new int[nums.length];
        mx[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            mx[i] = Math.max(mx[i - 1], nums[i]);
        }
        int[] pg = new int[nums.length];
        pg[0] = mx[0];

        for (int i = 1; i < nums.length; i++) {
            pg[i] = findGCD(mx[i], nums[i]);
        }
        Arrays.sort(pg);
        long sum = 0l;
        for (int i = 0; i < pg.length / 2; i++) {
           sum += (long)findGCD(pg[i], pg[pg.length - i - 1]);
        }
        return sum;
    }
}
