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
    public boolean validate(TreeNode root, Integer low, Integer high) {
        if(root == null) {
            return true; 
        }
        // current root should be between min and max
        
        if( (low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false; 
        }
        
        //   // current node must be between min and max
        // if( (min != null && root.val <= min) || (max != null && root.val <= max)) {
        //     return false; 
        // }
        
        // update the low and high 
        return validate(root.left, low, root.val) && validate (root.right, root.val, high); 
        
    } 
}