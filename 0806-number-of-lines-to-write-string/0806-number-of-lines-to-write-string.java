class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int i = 0;
        int[] res = new int[2];
        int sum = 0;
        int line = 1; 
        while (i < s.length()) {
            int w = widths[s.charAt(i) - 'a']; 

            if (sum + w <= 100) { 
                sum += w;
                i++;
            } else { 
                sum = w;
                line++;
                i++;
            }
        }
        
        res[0] = line;
        res[1] = sum;
        return res;
    }
}