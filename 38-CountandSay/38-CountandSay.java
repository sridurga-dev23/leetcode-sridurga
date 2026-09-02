// Last updated: 9/2/2026, 9:20:30 AM
1class Solution {
2    public String countAndSay(int n) {
3        String result = "1";
4        for (int i = 1; i < n; i++) {
5            result = describe(result);
6        }
7        return result;
8    }
9
10    private String describe(String s) {
11        StringBuilder sb = new StringBuilder();
12        int count = 1;
13
14        for (int i = 1; i < s.length(); i++) {
15            if (s.charAt(i) == s.charAt(i - 1)) {
16                count++;
17            } else {
18                sb.append(count).append(s.charAt(i - 1));
19                count = 1;
20            }
21        }
22
23        sb.append(count).append(s.charAt(s.length() - 1));
24        return sb.toString();
25    }
26}