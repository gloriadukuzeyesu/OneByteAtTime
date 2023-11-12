/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    
    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
    
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) {
            return head; 
        }
        
        Node p = new Node (0, null, head, null); 
        dfs(p, head); 
        p.next.prev = null; 
        return p.next; 
        
    }
      /* return the tail of the flatten list */

    public Node dfs(Node prev, Node curr) {
        if(curr == null) {
            return prev; 
        } 
        curr.prev = prev; 
        prev.next = curr; 
        
        Node tempNext = curr.next; 
        Node tail = dfs(curr, curr.child); 
        curr.child = null; 
        
        return dfs(tail, tempNext); 
    }
}