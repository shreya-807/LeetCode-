class Solution {
    public boolean squareIsWhite(String coordinates) {
        if(coordinates.charAt(0)%2!=0){
            if(coordinates.charAt(1)%2!=0){
                return false;
            } return true;
        }
 if(coordinates.charAt(0)%2==0){
            if(coordinates.charAt(1)%2==0){
                return false;
            } return true;
        }
return true;
    }
}