// Last updated: 8/13/2026, 3:41:55 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start=toSeconds(startTime);
        int end=toSeconds(endTime);
        return end-start;
    }
  private int toSeconds(String t){
      int hh=Integer.parseInt(t.substring(0,2));
      int mm=Integer.parseInt(t.substring(3,5));
      int ss=Integer.parseInt(t.substring(6,8));
      return hh*3600+mm*60+ss;
  }
}