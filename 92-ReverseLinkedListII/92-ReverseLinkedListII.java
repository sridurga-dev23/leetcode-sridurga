// Last updated: 9/2/2026, 10:20:39 AM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        ListNode dummy = new ListNode(0); // created dummy node
14        dummy.next = head;
15        ListNode prev = dummy; // intialising prev pointer on dummy node
16        
17        for(int i = 0; i < left - 1; i++)
18            prev = prev.next; // adjusting the prev pointer on it's actual index
19        
20        ListNode curr = prev.next; // curr pointer will be just after prev
21        // reversing
22        for(int i = 0; i < right - left; i++){
23            ListNode forw = curr.next; // forw pointer will be after curr
24            curr.next = forw.next;
25            forw.next = prev.next;
26            prev.next = forw;
27        }
28        return dummy.next;
29    }
30}