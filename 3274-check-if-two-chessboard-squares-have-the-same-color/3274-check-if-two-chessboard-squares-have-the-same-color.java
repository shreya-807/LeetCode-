class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        if (coordinate1.charAt(0) % 2 != 0 && coordinate2.charAt(0) % 2 != 0) {
            if (coordinate1.charAt(1) % 2 != 0 && coordinate2.charAt(1) % 2 != 0) {
                return true;
            }
            if (coordinate1.charAt(1) % 2 == 0 && coordinate2.charAt(1) % 2 == 0) {
                return true;
            }
            return false;

        }

        if (coordinate1.charAt(0) % 2 == 0 && coordinate2.charAt(0) % 2 == 0) {
            if (coordinate1.charAt(1) % 2 != 0 && coordinate2.charAt(1) % 2 != 0) {
                return true;
            }
            if (coordinate1.charAt(1) % 2 == 0 && coordinate2.charAt(1) % 2 == 0) {
                return true;
            }
            return false;
        }

        if (coordinate1.charAt(0) % 2 != 0 && coordinate2.charAt(0) % 2 == 0) {
            if (coordinate1.charAt(1) % 2 == 0 && coordinate2.charAt(1) % 2 != 0) {
                return true;
            }
            if (coordinate1.charAt(1) % 2 != 0 && coordinate2.charAt(1) % 2 == 0) {
                return true;
            }
            return false;
        }
 if (coordinate1.charAt(0) % 2 == 0 && coordinate2.charAt(0) % 2 != 0) {
            if (coordinate1.charAt(1) % 2 == 0 && coordinate2.charAt(1) % 2 != 0) {
                return true;
            }
            if (coordinate1.charAt(1) % 2 != 0 && coordinate2.charAt(1) % 2 == 0) {
                return true;
            }
            return false;
        }
return false;



    }
}