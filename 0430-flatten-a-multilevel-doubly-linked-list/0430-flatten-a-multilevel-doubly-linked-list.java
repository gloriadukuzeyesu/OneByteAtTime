/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }
    public Node dfs(Node curr) {
        Node prev = curr; 
        while(curr != null) {
            prev = curr;
            if(curr.child != null) {
                Node tail = dfs(curr.child);
                tail.next = curr.next;
                if(curr.next != null) {
                    curr.next.prev = tail;
                }
                curr.next = curr.child; 
                curr.child.prev = curr;
                curr.child = null;
                
                curr = tail.next;
                prev = tail;
                
            } else {
                curr = curr.next;
            }
        }
        return prev;
    }
}