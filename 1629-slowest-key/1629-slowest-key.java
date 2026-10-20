class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] time = new int[releaseTimes.length];
        time[0] = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            time[i] = releaseTimes[i] - releaseTimes[i - 1];
        }
        ArrayList<Character> c = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < releaseTimes.length; i++) {
            if (maxi < time[i]) {
                maxi = time[i];
            }
        }
        for (int i = 0; i < time.length; i++) {
            if (time[i] == maxi) {
                c.add(keysPressed.charAt(i));
            }
        }
        // if (c.size() == 1)
        //     return c.get(0);
        if (c.size() == 0)
            return keysPressed.charAt(0);
        char largest = c.get(0);
        for (int i = 1; i < c.size(); i++) {
            if (c.get(i) > largest) {
                largest = c.get(i);
            }
        }
        return largest;
    }
}