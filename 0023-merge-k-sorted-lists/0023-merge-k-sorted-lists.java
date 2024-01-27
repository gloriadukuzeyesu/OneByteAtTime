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
        // create a min heap
        // put a every list in a min heap
        // create a ListNode from that min heap
        
        // Space complexity is O(n)
        // time complexity is O(nlog K)
        // where K is the number of linked lists 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
        for(ListNode head : lists) {
            while(head != null) {
                minHeap.add(head.val); 
                head = head.next; 
            }
        }
        ListNode dummy = new ListNode(0); 
        ListNode head = dummy;
        while(!minHeap.isEmpty()) {
            head.next = new ListNode(minHeap.remove()); 
            head = head.next; 
        }
        
        return dummy.next; 
    }
}