//520. Detect Capital
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 1;
        if (word.length() == 1)
            return true;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
                if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                    count++;
                }
            }
            if (count == word.length())
                return true;
        }
        count = 1;
        for (int i = 1; i < word.length(); i++) {

            if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                count++;
            }
            if (count == word.length())
                return true;
        }
        return false;
    }
}
