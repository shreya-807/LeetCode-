class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCountMap.containsKey(c)) {
                int oldCount = charCountMap.get(c);
                charCountMap.put(c, oldCount + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        int b = 0;
        int count = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            int value = entry.getValue();
            if (value % 2 == 0)
                count += value;
            else if (value % 2 != 0) {
                count += value - 1;
                b = 1;
            }
        }
        if (b == 1)
            return count + 1;
        else
            return count;
    }
}