//2144. Minimum Cost of Buying Candies With Discount
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        for (int i = 0; i < cost.length / 2; i++) {
            int temp = cost[i];
            cost[i] = cost[cost.length - 1 - i];
            cost[cost.length - 1 - i] = temp;
        }
        int mincost = 0;
    
        for (int i = 0; i < cost.length; i++) {
            if ((i + 1) % 3 == 0)
                continue;
            else
                mincost+=cost[i];
        }
       
        return mincost;
    }
}
