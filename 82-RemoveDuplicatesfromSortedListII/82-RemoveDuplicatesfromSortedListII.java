// Last updated: 9/2/2026, 10:26:29 AM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        if (head == null || head.next == null) return head;
14
15        ListNode dummy = new ListNode(-1); // Dummy node to handle head removals
16        dummy.next = head;
17        ListNode prev = dummy;
18        ListNode cur = head;
19
20        while (cur != null && cur.next != null) {
21            if (cur.val == cur.next.val) {
22                // Skip all nodes with the same value
23                while (cur.next != null && cur.val == cur.next.val) {
24                    cur = cur.next;
25                }
26                prev.next = cur.next; // Remove duplicates
27            } else {
28                prev = prev.next; // Move to next distinct node
29            }
30            cur = cur.next;
31        }
32
33        return dummy.next;
34    }
35}