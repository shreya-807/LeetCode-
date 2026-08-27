class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> st = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            st.add(stones[i]);
        }
        Collections.sort(st);

        for (int i = st.size() - 1; i >= 1; i--) {
            if (st.size() < 2)
                break;
            i = st.size() - 1;
            int y = st.get(i);
            int x = st.get(i - 1);
            if (x == y) {
                st.remove(i);
                st.remove(i - 1);
            } else if (x != y) {

                st.remove(i);
                st.remove(i - 1);
                st.add(y - x);
            }
            Collections.sort(st);

        }
        if (st.size() > 0) {
            return st.get(0);
        }
        return 0;
    }
}