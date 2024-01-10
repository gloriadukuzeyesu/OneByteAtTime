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
       ListNode p1 = l1; 
       ListNode p2 = l2;
       ListNode dummyHead = new ListNode(0);
       ListNode current = dummyHead;
       int carry = 0; 
      while(p1 != null && p2 != null) {
          int sum = p1.val + p2.val; //7
          sum += carry; //8
          if (sum > 9) {
              int rem = sum % 10; // 10
              current.next = new ListNode(rem);
          } else{
              current.next = new ListNode(sum);
          }
          current = current.next;  
          carry = sum / 10;   // 0
          p1 = p1.next;
          p2 = p2.next;
      }
      
      while(p1 != null || p2 != null) {
          if(p1 != null) {
              int total = p1.val + carry;
              int rem = total % 10;
              current.next = new ListNode(rem);
              current = current.next; 
              carry = total / 10; 
              p1 = p1.next;
          } else{
              // p1 == null
              int total = p2.val + carry;
              int rem = total % 10; 
              current.next = new ListNode(rem);
              current = current.next; 
              carry = total / 10; 
              p2 = p2.next;
          }
      }

      if(carry != 0) {
         current.next = new ListNode(carry);
          
      }
       return dummyHead.next; 
    }
}