// Last updated: 9/2/2026, 10:27:26 AM
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
12    public ListNode partition(ListNode head, int x) {
13              if(head == null || head.next == null) {
14            return head;
15        }
16        ListNode less = new ListNode(-1);
17        ListNode more = new ListNode(-1);
18
19        ListNode tail1 = less;
20        ListNode tail2 = more;
21
22        ListNode temp = head;
23        while(temp != null) {
24            if(temp.val < x) {
25                tail1.next = temp;
26                tail1 = tail1.next;
27            }
28            else {
29                tail2.next = temp;
30                tail2 = tail2.next;
31            }
32            temp = temp.next;
33        }
34        
35        tail1.next = more.next;
36        tail2.next = null;
37        return less.next;
38  
39    }
40}