//3612. Process String with Special Operations I
class Solution {
    public String processStr(String s) {
        ArrayList<Character> str= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
str.add(s.charAt(i));}
else if(s.charAt(i)=='*'){
    if(str.size()>=1)
    str.remove(str.size()-1);
    else
    continue;
        }
        else if(s.charAt(i)=='%')
        Collections.reverse(str);
        else if(s.charAt(i)=='#')
        str.addAll(str); 

    } StringBuilder result = new StringBuilder();
        for (char ch : str) {
            result.append(ch);
        }
        
        return result.toString();}
}
