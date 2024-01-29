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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right); 
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right); 
    
    }
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftPath = height(root.left);
        int rightPath = height(root.right); 
        return Math.max(leftPath, rightPath) + 1; 
    }
}