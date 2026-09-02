// Last updated: 9/2/2026, 10:28:50 AM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18             Map<Node, Node> hashMap = new HashMap<>();
19        Node curr = head;
20
21        // Step 1: Create deep-copied shells of all nodes and catalog them 🖨️
22        while (curr != null) {
23            hashMap.put(curr, new Node(curr.val));
24            curr = curr.next; 
25        }
26
27        curr = head;
28        // Step 2: Loop back through to wire up next and random pointers securely 🪡
29        while (curr != null) {
30            Node cp = hashMap.get(curr);
31            
32            // Set pointers using mapped values
33            cp.next = hashMap.get(curr.next);
34            cp.random = hashMap.get(curr.random);
35            
36            curr = curr.next;
37        } 
38        
39        // Return the cloned head node
40        return hashMap.get(head);
41   
42    }
43}