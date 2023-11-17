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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next; 
        }
        ListNode previous = null; 
        ListNode current = slow; 
        while( current != null) {
            ListNode temporary = current.next; // 1
            current.next = previous; 
            previous = current; 
            current = temporary; 
        }
        while(previous != null) {
            if(previous.val != head.val) {
                return false; 
            }
            previous = previous.next; 
            head = head.next; 
        }
        return true;
    }
}