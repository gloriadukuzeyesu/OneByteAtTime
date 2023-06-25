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
        ListNode slow = head; 
        ListNode fast = head; 
        // fast pointer move twice as slow. Eventually the fast pointer will catch the slow    
        //pointer if there is a cycle. 

        while(fast != null && fast.next != null) {
            fast = fast.next.next; 
            slow = slow.next;
            if(fast == slow) {
                return true; 
            }       
        }
        return false; 
    }
}