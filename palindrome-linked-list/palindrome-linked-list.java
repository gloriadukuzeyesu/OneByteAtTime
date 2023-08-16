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
    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true; 
        }
        int listLength = 0;
        ListNode p1 = head;
        while (p1 != null) {
            p1 = p1.next;
            listLength++;
        }
        int [] arr = new int[listLength];
        int index = 0;
        ListNode p2 = head;
        while(p2 != null) {
            arr [index] = p2.val;
            index++;
            p2 = p2.next;
        }
        int front = 0;
        int back = arr.length - 1;
        while (front < back){
            if(arr[front] != arr[back]) {
                return false; 
            }else{
                front ++;
                back--; 
            }
        }
        return true; 
    }
}