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
        // find the middle of the head
        ListNode slow = head; 
        ListNode fast = head.next; 
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2nd part of the listnode
        // reverse the 2nd portion of node
        ListNode newNode = slow.next; 
        slow.next = null; 
        ListNode prev = null; 
        while(newNode != null) {
            ListNode temp = newNode.next;
            newNode.next = prev; 
            prev = newNode; 
            newNode = temp;
        }
        // head of the reversed head is prev; 
        
        ListNode p1 = head; 
        newNode = prev; 
        while (newNode != null) {
            ListNode temp1 = p1.next; 
            ListNode temp2 = newNode.next;
            p1.next = newNode; 
            newNode.next = temp1; 
            p1 = temp1;
            newNode = temp2;
        } 
    }
}