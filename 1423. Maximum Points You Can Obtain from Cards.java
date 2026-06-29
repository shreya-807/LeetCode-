//1423. Maximum Points You Can Obtain from Cards
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i = 0;
        int currsum = 0;
        int sum = 0;
        int res = sum;
        int j = cardPoints.length - 1;
        for (i = 0; i < k; i++) {
            currsum += cardPoints[i];
        }
        i--;
        sum = currsum;
        res = currsum;
        while (i >= 0) {
            sum -= cardPoints[i];
            sum = sum + cardPoints[j];
            i--;
            j--;
            res = Math.max(res, sum);
        }
        return res;

    }
}
