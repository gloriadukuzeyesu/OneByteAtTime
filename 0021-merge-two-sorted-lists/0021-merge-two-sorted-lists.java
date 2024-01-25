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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); 
        ListNode curr = dummy;
        ListNode list1_pointer = list1; 
        ListNode list2_pointer = list2; 
        while(list1_pointer != null && list2_pointer != null) {
            if(list1_pointer.val <= list2_pointer.val) {
                curr.next = list1_pointer; 
                list1_pointer = list1_pointer.next; 
            } else {
                curr.next = list2_pointer; 
                list2_pointer = list2_pointer.next;  
            }
            curr = curr.next; 
        }
        // in case l1 ends before l2
        while(list2_pointer != null) {
            curr.next = list2_pointer;
            list2_pointer = list2_pointer.next; 
            curr  = curr.next; 
        }
        
        // case where l2 ends before l1
        while(list1_pointer != null) {
            curr.next = list1_pointer; 
            curr = curr.next; 
            list1_pointer = list1_pointer.next;    
        }
        
        return dummy.next; 
    }
}