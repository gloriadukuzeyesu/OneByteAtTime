/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head; 
        ListNode slow = head; 
        // fast will move two steps
        // slow will move one step
        // there is a circle is fast pointer catches the slow pointer
        
        while( fast != null && fast.next != null) {
            fast = fast.next.next; // fast will move two steps
            slow = slow.next;
            if(fast == slow) {
                return true; 
            } 
        }
        return false; 
    }
}