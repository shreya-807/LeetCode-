class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            list.add(index[i], nums[i]);
        }
        int[] primitiveArray = list.stream().mapToInt(Integer::intValue).toArray();
        return primitiveArray;
    }
}