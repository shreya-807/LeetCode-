//3300. Minimum Element After Replacement With Digit Sum
class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int d = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            while (nums[i] > 0) {
                d = nums[i] % 10;
                sum += d;
                nums[i] /= 10;
            }
            list.add(sum);

        }
        Collections.sort(list);
        return list.get(0);
    }
}
