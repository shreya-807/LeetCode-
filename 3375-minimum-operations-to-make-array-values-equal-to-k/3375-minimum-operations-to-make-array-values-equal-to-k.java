class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 0;
        Integer[] arr = set.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >k)
                count++;

                else  if (arr[i] >=k)
                continue;
            else
                return -1;

        }

        return count;
    }
}