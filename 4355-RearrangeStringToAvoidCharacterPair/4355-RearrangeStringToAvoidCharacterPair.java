// Last updated: 8/13/2026, 3:42:11 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
      Character[] arr=new Character[s.length()] ;
        StringBuilder first=new StringBuilder ();
        StringBuilder middle=new StringBuilder ();
        StringBuilder last=new StringBuilder ();
        for(char c:s.toCharArray()){
            if(c==y)
                first.append(c);
            else if(c==x)
                last.append(c);
            else
                middle.append(c);
        }
        return first.toString()+middle.toString()+last.toString();
    }
}