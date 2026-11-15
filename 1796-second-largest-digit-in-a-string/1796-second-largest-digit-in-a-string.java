class Solution {
    public int secondHighest(String s) {
        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                ch.add(s.charAt(i));
            }
        }
        HashSet<Character> set = new HashSet<>(ch);
        ch = new ArrayList<>(set);
        if (ch.size() < 2) {
            return -1;
        }
        Collections.sort(ch);
       Collections.reverse(ch);
       return ch.get(1)-48;

    }
}