// Last updated: 9/2/2026, 9:29:45 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        List<Integer>[] bucket = new List[nums.length + 1];
4        HashMap<Integer, Integer> hm = new HashMap<>();
5        for (int num : nums) {
6            hm.put(num, hm.getOrDefault(num,0) + 1);
7        }
8        for (int key : hm.keySet()) {
9            int freq = hm.get(key);
10            if (bucket[freq] == null) {
11                bucket[freq] = new ArrayList<>();
12            }
13            bucket[freq].add(key);
14        }
15        int[] ans = new int[k];
16        int pos = 0;
17        for (int i = bucket.length - 1; i >= 0; i--) {
18            if (bucket[i] != null) {
19                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
20                    ans[pos] = bucket[i].get(j);
21                    pos++;
22                }
23            }
24        }
25        return ans;
26    }
27}