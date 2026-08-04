class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list1 = new ArrayList<>();
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list2.add(nums[i]);
        }

        list1.removeAll(list2);
        return list1;

    }
}