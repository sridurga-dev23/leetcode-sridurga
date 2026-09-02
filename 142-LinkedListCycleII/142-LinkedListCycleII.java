// Last updated: 9/2/2026, 10:30:23 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14         if (head == null || head.next == null) {
15            return null;
16        }
17
18        ListNode slow = head;
19        ListNode fast = head;
20
21        // Phase 1: detect whether a cycle exists
22        while (fast != null && fast.next != null) {
23            slow = slow.next;
24            fast = fast.next.next;
25
26            if (slow == fast) {
27                // Phase 2: find where the cycle starts
28                ListNode ptr = head;
29                while (ptr != slow) {
30                    ptr = ptr.next;
31                    slow = slow.next;
32                }
33                return ptr;
34                  }
35        }
36        return null;
37    }
38}