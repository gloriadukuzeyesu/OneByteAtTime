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
        return root == null || checkSymmetric(root.left, root.right);   
    }
    private boolean checkSymmetric(TreeNode subtree0, TreeNode subtree1) {
        if(subtree0 == null && subtree1 == null) {
            return true; 
        }
        if(subtree0 == null || subtree1 == null || subtree0.val != subtree1.val) {
            return false; 
        }
        // if() {
        //     return false; 
        // }
        
        return checkSymmetric(subtree0.left, subtree1.right) && checkSymmetric(subtree0.right,   
                                                                               subtree1.left); 
    }
}