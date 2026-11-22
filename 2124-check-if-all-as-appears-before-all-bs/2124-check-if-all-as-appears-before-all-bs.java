class Solution {
    public boolean checkString(String s) {
        int counta = 0;
        int countb = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                counta++;
            } else
                countb++;
        }
        if (counta == 0 || countb == 0) {
            return true;
        }
        for (int i = 0; i < counta; i++) {
            if (s.charAt(i) != 'a')
                return false;
        }
        return true;
    }
}