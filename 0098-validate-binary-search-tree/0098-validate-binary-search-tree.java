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
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null); 
    }
    private boolean validate(TreeNode root, Integer max, Integer min) {
        // if we reach the end of the tree, return true
        if(root == null) {
            return true; 
        } else if (max != null && root.val >= max || min != null && root.val <= min) {
            return false; 
        } else {
            // recursively call left and right children and validate them as well
            return validate(root.left, root.val, min) && validate(root.right, max, root.val); 
        }
        
    }
}