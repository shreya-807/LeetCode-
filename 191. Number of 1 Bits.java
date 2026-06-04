//191. Number of 1 Bits
class Solution {
    public int hammingWeight(int n) {
        ArrayList<Integer> rem = new ArrayList<>();
        while (n > 0) {
            rem.add(n % 2);
            n /= 2;
        }
        int count = 0;
        for (int i = 0; i < rem.size(); i++) {
            if (rem.get(i) == 1)
                count++;
        }
        return count;
    }
}
