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
        
    // Step1: find the middle of the listnode  1->2->3->4 , slow p will be pointing at 2 when done
        
        ListNode slow = head; 
        ListNode fast = head.next; 
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        // at this point the slow pointer  is pointing at the middle of the listNode
    // Step2 reverse the second half 1->2->4->3
        ListNode HeadOfSecondHalf = slow.next; 
        ListNode prev = slow.next = null;

        while (HeadOfSecondHalf != null) {
             ListNode nextNode = HeadOfSecondHalf.next; 
             HeadOfSecondHalf.next = prev; 
             prev = HeadOfSecondHalf; 
             HeadOfSecondHalf = nextNode;     
        }
        
        // reorder the whole list 1->4->2->3
        HeadOfSecondHalf = prev;
        ListNode originalHead = head; 
        
        while(HeadOfSecondHalf!=null) {
            ListNode temp1 = originalHead.next; 
            ListNode temp2 = HeadOfSecondHalf.next; 
            originalHead.next = HeadOfSecondHalf; 
            HeadOfSecondHalf.next = temp1; 
            originalHead = temp1; 
            HeadOfSecondHalf = temp2;
        }
    }
}