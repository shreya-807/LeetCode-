//Q1. Build an Array With Stack Operations
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int[] in = new int[n];
        for (int i = 0; i < in.length; i++) {
            in[i] = i + 1;
        }
        int i = 0;
        int j = 0;
        while (i < in.length && j < target.length) {
            if (in[i] == target[j]) {
                res.add("Push");
                i++;
                j++;
            } else {
                res.add("Push");
                res.add("Pop");
                i++;
            }
        }
        return res;
    }
}
