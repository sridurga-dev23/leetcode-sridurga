// Last updated: 9/2/2026, 10:24:28 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0) {
14            return head;
15        }
16
17        int length = 1;
18        ListNode temp = head;
19
20        while (temp.next != null) {
21            temp = temp.next;
22            length++;
23        }
24
25        temp.next = head;
26        k = k % length;
27        k = length - k;
28
29        while (k-- > 0) {
30            temp = temp.next;
31        }
32
33        head = temp.next;
34        temp.next = null;
35
36        return head;
37    }
38}