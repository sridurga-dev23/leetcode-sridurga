// Last updated: 9/2/2026, 9:27:20 AM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for(int k : nums3)
5            for(int l : nums4)
6                map.put(k + l, map.getOrDefault(k + l, 0) + 1);
7        int count = 0;
8        for(int i : nums1)
9            for(int j : nums2)
10                        count += map.getOrDefault(-(i + j), 0);
11        return count;
12    }
13}