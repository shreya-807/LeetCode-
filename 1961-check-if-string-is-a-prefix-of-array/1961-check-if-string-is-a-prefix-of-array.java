class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            prefix.append(words[i]);

            if (prefix.toString().equals(s)) {
                return true;
            }

            if (prefix.length() > s.length()) {
                return false;
            }
        }

        return false;
    }
}