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
    public int maxDepth(TreeNode root) {
        int height = 0; 
        if (root == null) {
            return height; 
        }
        int leftHeight = 0; 
        if(root.left != null) {
             leftHeight = maxDepth(root.left);
        }
         int rightHeight = 0; 
        if(root.right != null) {
          rightHeight = maxDepth(root.right); 
        }
      
        height = Math.max(leftHeight, rightHeight) + 1; 
        return height;   
    }
    
 
}