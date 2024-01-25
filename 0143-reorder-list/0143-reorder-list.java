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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return; 
        }
        
        ListNode slow = head; 
        ListNode fast = head; 
        
        while(fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
              
        // reverse it
        ListNode secondHalf = reverse(slow); 
        System.out.println("secondHalf: " + secondHalf.val); 
        // merge 
        ListNode firstHalf = head; 
        while(secondHalf.next!= null) {
           ListNode temp1 = firstHalf.next; 
           ListNode temp2 = secondHalf.next; 
           
           firstHalf.next = secondHalf; 
           secondHalf.next = temp1;
            
           firstHalf = temp1;    
           secondHalf = temp2; 
        }
        
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null; 
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = temp; 
        }
        return prev; 
    }
}