class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n = 0;
        int[] res = new int[nums1.length];
        while (i < nums1.length) {
            for (int k = 0; k < nums2.length; k++) {
                if (nums1[i] == nums2[k]) {
                    n = k;
                    break;
                }
            }
            for (int k = n; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    res[i] = nums2[k];
                    break;
                }
                if (k == nums2.length - 1)
                    res[i] = -1;
            }
            i++;

        }
        return res;

    }
}
