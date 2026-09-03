class Solution {
    public int dominantIndices(int[] nums) {
        ArrayList<Double> list = new ArrayList<>();
        double avg = 0;
        int i = 0;
        while (i < nums.length) {
            for (int j = i + 1; j < nums.length; j++) {
                avg += nums[j];
            }
            list.add(avg);
            i++;
            avg = 0;
        }
        int count = 0;
        int k = nums.length - 1;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] * k > list.get(i))
                count++;
            k--;
        }
        return count;
    }
}