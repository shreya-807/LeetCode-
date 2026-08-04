class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length();
        int m = n - 1;
        int i = 0;
        if (s.charAt(n - 1) != ' ') {
            for (i = n - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ')
                    count++;
                else
                    break;
            }return count;
        }
        for (i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                m = i;
            else
                break;
        }
        for (i = m - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else
                break;
        }
        return count;
    }
}