class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> freq = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                freq.add(count);
                count = 1;
            }
        } freq.add(count);
        Collections.sort(freq);
        Collections.reverse(freq);
        int sum = 0;
        int maxFreq = freq.get(0);
        for (int i = 0; i < freq.size(); i++) {
            if (freq.get(i) == maxFreq) {
                sum += freq.get(i);
            } else {

                break;
            }
        }
        return sum;
    }
}