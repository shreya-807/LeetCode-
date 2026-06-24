//8. String to Integer (atoi)
class Solution {
    public int myAtoi(String s) {
        Long value = 0l;
        ArrayList<Integer> res = new ArrayList<>();
        int index = 0;
        int neg = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = i + 1;
            } else if (s.charAt(i) == '-') {
                neg = 1;
                index = i + 1;
                break;
            } else if (s.charAt(i) == '+') {
                neg = 0;
                index = i + 1;
                break;
            } else {
                break;
            }
        }
        for (int i = index; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                res.add((int) (s.charAt(i) - '0'));
            else
                break;

        }
        for (int i = 0; i < res.size(); i++) {
            if (value > Integer.MAX_VALUE || (value == Integer.MAX_VALUE / 10 && res.get(i) > 7)) {
                if (neg == 1)
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }

            value = value * 10 + (long) (res.get(i));
        }
        if (neg == 1)
            return (int) Math.clamp(-value, Integer.MIN_VALUE, Integer.MAX_VALUE);

        return (int) Math.clamp(value, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
}
