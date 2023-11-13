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
    public void flatten(TreeNode root) {
        flattenTree(root); 
    }
    public TreeNode flattenTree (TreeNode root) {
        if(root == null) {
            return null; 
        }
        if(root.right == null && root.left == null) {
            return root; 
        }
        
        TreeNode leftTail = flattenTree(root.left); 

        TreeNode rightTail = flattenTree(root.right);
        
        if(leftTail != null) {
            leftTail.right = root.right; 
            root.right = root.left; 
            root.left = null; 
        }
        
        return rightTail == null ? leftTail : rightTail;
           
    }
    
}