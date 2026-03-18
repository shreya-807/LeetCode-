//1437. Check If All 1's Are at Least Length K Places Away
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                res.add(i);
            }
        }
        if (res.size() == 0)
            return true;
        int count = 1;
        for (i = 0; i < res.size() - 1; i++) {
            if (res.get(i + 1) - res.get(i) > k) {
                count++;
            }
        }
        if (count == res.size())
            return true;
        return false;

    }
}
