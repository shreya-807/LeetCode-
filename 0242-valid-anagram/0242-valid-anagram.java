class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        Arrays.sort(charArray1);
        //  String sorted1 = new String(charArray1);

        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        // String sorted2 = new String(charArray2);
        int i = 0;
        int j = 0;
        if (charArray1.length != charArray2.length)
            return false;
        while (i < charArray1.length) {
            if (charArray1[i] != charArray2[j]) {
                return false;
            } else {
                i++;
                j++;
            }
        }return true;
    }
}