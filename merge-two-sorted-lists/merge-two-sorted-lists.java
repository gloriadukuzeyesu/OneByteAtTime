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
        ListNode dummy = new ListNode(0);
        ListNode res  = dummy;
        while (p1 != null && p2 != null) {
            if(p1.val <= p2.val) {
                dummy.next = p1;
                p1 = p1.next;
            }else {
                dummy.next = p2;
                p2 = p2.next;
            }
            dummy = dummy.next;
        }
        while(p1 != null) {
            dummy.next = p1;
            p1 = p1.next;
            dummy = dummy.next;
        }
        while(p2 != null) {
            dummy.next = p2;
            p2 = p2.next;
            dummy = dummy.next;
        }
        return res.next;
    }
}