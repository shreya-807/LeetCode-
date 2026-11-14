class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        if (total % 3 != 0)
            return false;
        int target = total / 3;
        int count = 0;
        int i = 0;
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == target) {
                count++;
                sum = 0;
            }
            if (count == 3)
                return true;
        }
        return false;
    }
}