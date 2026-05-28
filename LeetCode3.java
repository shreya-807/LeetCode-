class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int length = 0;
        Set<Character> set = new HashSet<>();
        for (i = 0; i < s.length(); i++) {
            while (j < s.length() && !set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                length = Math.max(length, j - i);
            }
            set.remove(s.charAt(i));
        }
        return length;
    }
}
