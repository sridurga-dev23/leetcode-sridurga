// Last updated: 8/13/2026, 3:41:57 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return ((start[0]+start[1])%2)==((target[0]+target[1])%2);
    }
}