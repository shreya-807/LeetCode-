class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int res = Integer.MAX_VALUE;
        int ind = -1;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                res = Math.min(res, capacity[i]);

            }
        }

        for (int i = 0; i < capacity.length; i++) {
            if (res == capacity[i])
                return i;
        }
        return -1;
    }
}