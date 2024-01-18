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
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
        
//     }
// }

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head; 
        }
        // length
        int n = 1; 
        ListNode oldTail = head; 
        while(oldTail.next != null) {
            n++;  
            oldTail = oldTail.next; 
        }

        k = k % n; /// 2 % 4
        
        if(k == 0) {
            return head; 
        }

        ListNode newtail = head; 
        int p = n - k; 
        while( p > 1) {
            newtail = newtail.next;
            p--; 
        }
        
        ListNode newHead = newtail.next; 
        newtail.next = null; // cut connection 
        
        oldTail.next = head;         
        return newHead; 
    }
}