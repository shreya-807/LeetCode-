class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            i++;
            sb.append(word2.charAt(j));
            j++;
        }
        if (i < word1.length()) {
            while (i < word1.length()) {
                sb.append(word1.charAt(i));
                i++;
            }
        }
        if (j < word2.length()) {
            while (j < word2.length()) {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        String res = sb.toString();
        return res;
    }
}