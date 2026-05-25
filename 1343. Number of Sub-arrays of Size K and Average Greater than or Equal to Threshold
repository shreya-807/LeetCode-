//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int tocompare = k * threshold;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int left = 0;
        int right = left + k - 1;
        int count = 0;

        while (left < (arr.length - k + 1)) {
            if (sum >= tocompare) {
                count++;
                if (right == arr.length - 1)
                    break;
                else {
                    right++;
                    left++;
                    sum = sum - arr[left - 1] + arr[right];
                }
            } else {
                if (right == arr.length - 1)
                    break;
                right++;
                left++;
                sum = sum - arr[left - 1] + arr[right];
            }
        }
        return count;
    }
}
