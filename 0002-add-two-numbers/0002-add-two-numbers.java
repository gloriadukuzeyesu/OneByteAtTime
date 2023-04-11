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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode result = dummyHead; 
        int carry = 0; 
        while ( list1 != null || list2 != null) {
            int sum = carry;
            
            if(list1 != null) {
                sum = sum + list1.val;
                list1 = list1.next;
            }
            
            if(list2 != null) {
                sum = sum + list2.val;
                list2 = list2.next;
            }
            
            result.next = new ListNode(sum % 10);
            result = result.next;
            carry = sum / 10; 
        }
        
        if( carry > 0){
            result.next = new ListNode(carry);
        }
      
        return dummyHead.next;    
    }

}