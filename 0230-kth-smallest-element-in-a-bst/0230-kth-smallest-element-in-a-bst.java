/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a,b) -> b - a);
        inorderTraversal(root, maxHeap, k); 
        return maxHeap.poll(); 
    }
    
    public void inorderTraversal(TreeNode root,  PriorityQueue<Integer> maxHeap, int k) {
        if(root == null) {
            return; 
        } 
        // left
        inorderTraversal(root.left, maxHeap, k); 
        // current node
        if(maxHeap.size() < k) {
            maxHeap.offer(root.val); 
        } else if (maxHeap.peek() > root.val) {
            maxHeap.poll(); 
            maxHeap.offer(root.val); 
        }
        // right 
        inorderTraversal(root.right, maxHeap, k); 
    }
}   