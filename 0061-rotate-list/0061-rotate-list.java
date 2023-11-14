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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return null; 
        }

        if(head.next == null) {
            return head;  
        }
        int len = 1; 
        ListNode oldTail = head; 
        while(oldTail.next != null) {
            oldTail = oldTail.next; 
            len++; 
        }
        
        // conect the old tail to the head
        oldTail.next = head; 
        
        k = k % len; // in case k is greater than len 
        
        // find the new tail
        int n = len - k - 1; // newtail 
        ListNode newTail = head; 
        
        for(int i = 0; i < n; i++) {
            newTail = newTail.next; 
        }
        ListNode newHead = newTail.next; 
        newTail.next = null;
        return newHead; 
        
    }
}