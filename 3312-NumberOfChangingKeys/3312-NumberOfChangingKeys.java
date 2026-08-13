// Last updated: 8/13/2026, 3:42:28 PM
class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}