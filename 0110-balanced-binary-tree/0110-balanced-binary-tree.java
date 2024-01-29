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
        int left_height = getHeight(root.left); 
        int right_height = getHeight(root.right); 
        
       return (Math.abs(left_height - right_height) <= 1) && isBalanced(root.left) && isBalanced(root.right); 
    }
    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int leftHeight = getHeight(root.left); 
        int rightHeight = getHeight(root.right);
        
        return 1 + Math.max(leftHeight,rightHeight); 
    }
}