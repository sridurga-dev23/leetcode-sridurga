// Last updated: 9/2/2026, 9:19:10 AM
1import java.util.Arrays;
2
3class Solution {
4    public int minimumPushes(String word) {
5        int[] freq = new int[26];
6        for (char c : word.toCharArray()) 
7        {
8            freq[c - 'a']++;
9        }
10
11        Arrays.sort(freq);
12
13        int totalPushes = 0;
14        int distinctCount = 0;
15
16        for (int i = 25; i >= 0; i--) 
17        {
18            if (freq[i] == 0) break;
19
20            int pushMultiplier = (distinctCount / 8) + 1;
21            totalPushes += freq[i] * pushMultiplier;
22
23            distinctCount++;
24        }
25
26        return totalPushes;
27    }
28}