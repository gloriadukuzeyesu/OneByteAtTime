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
    private ListNode reverse(ListNode node) {
        ListNode current = node;
        ListNode prev = null;
        while(current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current; 
            current = temp; 
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode fast = head; 
        ListNode slow = head; 
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // now slow is in the middle of the list 
        // reverse the second half of the list
        ListNode secondHalf = reverse(slow.next);
        ListNode firstHalf = head;
        while(secondHalf != null) {
            if(secondHalf.val != firstHalf.val) {
                return false;
            }else{
                secondHalf = secondHalf.next;
                firstHalf = firstHalf.next;
            }
        }
        return true; 
    }
}