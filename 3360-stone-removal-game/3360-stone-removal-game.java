class Solution {
    public boolean canAliceWin(int n) {

        ArrayList<Integer> res = new ArrayList<>();
        int m = 10;
        while (n > 0) {
            res.add(n - m);
            n = n - m;
            if(n<0)break;
            
            m--;
        }
        for (int i = 0; i < res.size(); i++) {
            if (i % 2 != 0 && res.get(i) < 0) {
                return true;
            }
            if (i % 2 == 0 && res.get(i) == 0)
                return true;
        }
        return false;

    }
}