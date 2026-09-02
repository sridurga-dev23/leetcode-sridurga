// Last updated: 9/2/2026, 10:21:47 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummyHead = new ListNode(0);
14        ListNode tail = dummyHead;
15        int carry = 0;
16
17        while (l1 != null || l2 != null || carry != 0) {
18            int digit1 = (l1 != null) ? l1.val : 0;
19            int digit2 = (l2 != null) ? l2.val : 0;
20
21            int sum = digit1 + digit2 + carry;
22            int digit = sum % 10;
23            carry = sum / 10;
24
25            ListNode newNode = new ListNode(digit);
26            tail.next = newNode;
27            tail = tail.next;
28
29            l1 = (l1 != null) ? l1.next : null;
30            l2 = (l2 != null) ? l2.next : null;
31        }
32
33        ListNode result = dummyHead.next;
34        dummyHead.next = null;
35        return result;
36    }
37}