//3658. GCD of Odd and Even Sums
  
  class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd = 0;
        int sumeven = 0;
        int i = 1;
        while (i <= 2 * n) {
            if (i % 2 == 0) {
                sumeven += i;
                i++;
            } else {
                sumodd += i;
                i++;
            }
        }

        int result = 1;
        i = 1;
        while (i != Math.max(sumeven, sumodd)) {
            if (sumeven % i == 0 && sumodd % i == 0) {
                result = i;
                i++;
            } else
                i++;
        }
        return result;
    }
}
