// Last updated: 8/13/2026, 3:41:59 PM
class Solution {
    public int countValidPrefixes(String s) {
     int z=0,O=0;
        int a=0;
        for(char c:s.toCharArray()){
            if(c=='0'){
                z++;
            }else{
                O++;
            }
            if(Math.abs(z-O)<=1){
            a++;
        }
        }
        return a;
}
}