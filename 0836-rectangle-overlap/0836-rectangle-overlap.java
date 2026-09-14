class Solution {
    public boolean isRectangleOverlap(int[] rectA, int[] rectB) {
        return (rectA[0] < rectB[2] && rectA[2] > rectB[0] &&
                rectA[1] < rectB[3] && rectA[3] > rectB[1]);
    }
}