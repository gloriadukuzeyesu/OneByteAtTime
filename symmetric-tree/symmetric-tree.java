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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true; 
        }
        Stack<TreeNode> stack = new Stack<>(); 
        stack.push(root.left); 
        stack.push(root.right); 
        TreeNode LEFT; 
        TreeNode RIGHT; 
        while(!stack.isEmpty()) {
            RIGHT = stack.pop(); 
            LEFT = stack.pop(); 
            if(LEFT == null && RIGHT == null) {
                continue; 
            }
            if(LEFT == null || RIGHT == null || LEFT.val != RIGHT.val) {
                return false; 
            }
            stack.push(LEFT.left);
            stack.push(RIGHT.right);
            stack.push(LEFT.right);
            stack.push(RIGHT.left);
        }
        return true;
    }
}