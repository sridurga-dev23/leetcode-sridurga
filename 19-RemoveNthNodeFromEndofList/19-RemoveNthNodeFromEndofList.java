// Last updated: 9/2/2026, 10:18:01 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        // Step 0: create dummy node pointing to head
14        ListNode dummy = new ListNode(0, head);
15        ListNode fast = dummy;
16        ListNode slow = dummy;
17        
18        // Step 1: Move fast n+1 steps ahead
19        for (int i = 0; i <= n; i++) {
20            fast = fast.next;
21        }
22        
23        // Step 2: Move both pointers until fast reaches the end
24        while (fast != null) {
25            fast = fast.next;
26            slow = slow.next;
27        }
28        
29        // Step 3: Delete the target node
30        slow.next = slow.next.next;
31        
32        // Step 4: Return new head
33        return dummy.next;
34    }
35}