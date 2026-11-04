class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb1 = new StringBuilder(order);
        StringBuilder sb2 = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < sb1.length()) {
            char ch = sb1.charAt(i);
            for (j = 0; j < sb2.length(); j++) {
                if (sb2.charAt(j) == ch) {
                    ans.append(sb2.charAt(j));
                    sb2.deleteCharAt(j);
                    j--;
                }
            }
            i++;
        }

        //rest of elements-
        j = 0;
        if (sb2.length() != 0) {
            while (j < sb2.length()) {
                ans.append(sb2.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}