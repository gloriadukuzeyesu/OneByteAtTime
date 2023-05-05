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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null; 
        ListNode dummyNode = new ListNode(0); 
        dummyNode.next = head;
        ListNode first = dummyNode, second = dummyNode; 
        
        // move the second pointer to the n times. 
        while (n > 0) {
            second = second.next; 
            n--; 
        }
        // the idea is that the distance maintained between first and second pointer will stay as n.
        
        while (second.next != null) {
            first = first.next; 
            second = second. next; 
        }
        first.next = first.next.next; 
        return dummyNode.next;   
    }
}