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
        // reverse the second half of the listnode, find the middle of the node 
        ListNode slow = head; 
        ListNode fast = head.next; 
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        // this point slow is pointing at the middle of the listNode
        // reverse the second half 
        ListNode HeadOfSecondHalf = slow.next; 
        ListNode prev = slow.next = null; 
        while (HeadOfSecondHalf != null) {
             ListNode nextNode = HeadOfSecondHalf.next; 
             HeadOfSecondHalf.next = prev; 
             prev = HeadOfSecondHalf; 
             HeadOfSecondHalf = nextNode;     
        }
        
        // reorder the whole list
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