class Solution {
    public String reverseWords(String sp) {
        String s = sp.trim().replaceAll("\\s+", " ");
        String[] st = s.split(" ");
        String temp = null;
        int i = 0;
        int j = st.length - 1;
        while (i < j) {
            temp = st[i];
            st[i] = st[j];
            st[j] = temp;
            i++;
            j--;
        }String result = String.join(" ", st);
        return result;
    }
}