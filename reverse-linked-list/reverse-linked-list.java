/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // iterative way 
        
        // ListNode current = head; 
        // ListNode prev = null;
        // while(current!= null) {
        //     ListNode temp = current.next;
        //     current.next = prev; 
        //     prev = current; 
        //     current = temp; 
        // }
        // return prev; 
        
        // Recursive way 
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head; 
        }
        ListNode node= reverseList(head.next); 
        head.next.next = head; 
        head.next = null; 
        return node; 
    }
}