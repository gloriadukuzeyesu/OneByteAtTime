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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false; 
        }
        if(sameTree(root, subRoot)) {
            return true; 
        }
        
        boolean leftLeg = isSubtree(root.left, subRoot); 
        boolean rightLeg = isSubtree(root.right, subRoot); 
        return leftLeg || rightLeg; 
        
        
    }
    public boolean sameTree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true; 
        if(root == null && subRoot != null || root != null && subRoot == null) {
            return false; 
        }
        if(root.val != subRoot.val) {
            return false; 
        }
        boolean leftCheck= sameTree(root.left, subRoot.left); 
        boolean rightCheck = sameTree(root.right, subRoot.right); 
        return leftCheck && rightCheck; 
    }
}