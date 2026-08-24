// Last updated: 8/24/2026, 11:24:23 AM
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
18        if(head==null){
19            return null;
20        }
21        Node temp=head;
22        while(temp!=null){
23            Node node=new Node(temp.val);
24            node.next=temp.next;
25            temp.next=node;
26            temp=node.next;
27        }
28        temp=head;
29        while(temp!=null){
30            Node node=temp.next;
31            node.random=temp.random!=null?temp.random.next:null;
32            temp=node.next;
33        }
34        temp=head;
35        Node newHead=head.next;
36        while(temp!=null){
37            Node node=temp.next;
38            temp.next=node.next;
39            if(node.next!=null){
40                node.next=node.next.next;
41            }
42            temp=temp.next;
43        }
44        return newHead;
45    }
46}