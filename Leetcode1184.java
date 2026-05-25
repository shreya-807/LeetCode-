//1184. Distance Between Bus Stops
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int end) {
        int sum = 0;
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
        }if (start > end) {
    int temp = start;
    start = end;
    end = temp;
}
        int sum1 = 0;
        if (end > start) {
            for (int i = start; i < end; i++) {
                sum1 += distance[i];
            }
            int ans = Math.min(sum1, Math.abs(sum - sum1));
            return ans;

        }
        // int sum2 = 0;
        // if (end < start) {
        //     for (int i = end; i < start; i++) {
        //         sum2 += distance[i];
        //     }
        //     int ans = Math.min(sum2, Math.abs(sum - sum2));
        //     return ans;
        // }
        return 0;
    }
}
