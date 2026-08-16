class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !s1.isEmpty()) {
                s1.pop();
            } else if (s.charAt(i) == '#' && s1.isEmpty()) {
                continue;
            } else {
                s1.push(String.valueOf(s.charAt(i)));
            }
        }
        Stack<String> s2 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && !s2.isEmpty()) {
                s2.pop();
            } else if (t.charAt(i) == '#' && s2.isEmpty()) {
                continue;
            } else
                s2.push(String.valueOf(t.charAt(i)));
        }
        if (s1.size() != s2.size()) {
            return false;
        }
        while (!s1.isEmpty()) {
            if (!s1.pop().equals(s2.pop())) {
                return false;
            }
        }
        return true;
    }
}