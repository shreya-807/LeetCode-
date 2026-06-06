//Q1. Exactly One Consecutive Set Bits Pair

  class Solution {
    public boolean consecutiveSetBits(int n) {
       ArrayList<Integer> bin=new ArrayList<>();
        while(n>0){
            bin.add(n%2);
            n/=2;
        }
        int count=0;
        for(int i=0;i<bin.size()-1;i++){
            if(bin.get(i)==bin.get(i+1) && bin.get(i)==1)
                count++;
        }if(count>1){
            return false;
        }if(count==1)return true;
        return false;
    }
}©leetcode
