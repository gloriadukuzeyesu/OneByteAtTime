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
        ListNode p1 = list1; 
        ListNode p2 = list2; 
        ListNode dummyHead = new ListNode(0); 
        ListNode mergedList = dummyHead; 
        
        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                mergedList.next = p1; 
                p1 = p1.next; 
            } else {
                mergedList.next = p2; 
                p2 = p2.next; 
            }
            mergedList = mergedList.next;    
        }
        while(p1 != null) {
            mergedList.next = p1; 
            p1 = p1.next; 
            mergedList = mergedList.next; 
        }
        
         while(p2 != null) {
            mergedList.next = p2; 
            p2 = p2.next; 
            mergedList = mergedList.next; 
        }
        return dummyHead.next; 
        
    }
}