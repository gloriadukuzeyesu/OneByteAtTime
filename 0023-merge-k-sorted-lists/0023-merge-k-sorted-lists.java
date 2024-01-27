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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null; 
        if(lists.length == 1) return lists[0]; 
        ListNode head = mergeTwoLists(lists[0], lists[1]); 
        for(int i = 2; i < lists.length; i++) {
            head = mergeTwoLists(head, lists[i]);
        }
        return head; 
        
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1; 
        ListNode p2 = list2; 
        ListNode dummy = new ListNode(0); 
        ListNode mergedList = dummy; 
        while(p1 != null && p2 != null) {
            if(p1.val <= p2.val) {
                mergedList.next = p1; 
                p1 = p1.next; 
            } else {
                mergedList.next = p2; 
                p2 = p2.next; 
            }
            mergedList = mergedList.next; 
        }
        
        if(p1 != null) {
            mergedList.next = p1; 
        }
        
        if(p2 != null) {
            mergedList.next = p2; 
        }
        
        return dummy.next; 
    }
}