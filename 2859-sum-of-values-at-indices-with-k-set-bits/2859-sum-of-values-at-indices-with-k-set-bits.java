class Solution {
    public int num1(int n) {
        if (n == 0)
            return 0;
        else
            return num1(n / 2) + n % 2;
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        ArrayList<Integer> ind = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            count = num1(i);
            if (count == k)
                ind.add(nums.get(i));
        }
        int sum = 0;
        for (int i = 0; i < ind.size(); i++) {
            sum += ind.get(i);
        }
        return sum;
    }
}