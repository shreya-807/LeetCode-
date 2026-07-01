//848. Shifting Letters
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int[] prefix = new int[shifts.length];
        int n = shifts.length;
        prefix[n - 1] = shifts[n - 1] % 26;
        for (int i = n - 2; i >= 0; i--) {
            prefix[i] = (prefix[i + 1] + shifts[i]) % 26;
        }
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[i] = res[i] = (char) ('a' + (s.charAt(i) - 'a' + prefix[i]) % 26);
        }
        return new String(res);
    }
}
