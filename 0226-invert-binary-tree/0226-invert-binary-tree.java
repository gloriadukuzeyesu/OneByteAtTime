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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null; 
        }
        if(root.left == null && root.right == null) {
            return root; 
        }
        TreeNode leftLeg = invertTree(root.left); 
        TreeNode rightLeg = invertTree(root.right); 
        root.right = leftLeg; 
        root.left = rightLeg; 
        return root; 
    }
}