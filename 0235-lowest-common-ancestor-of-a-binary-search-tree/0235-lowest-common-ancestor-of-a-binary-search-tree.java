/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null; 
        }
        // Since it is a bst. 
        // find the side where both q and p resides
        // if they are on both sides of the tree, the current root is the split point.
        // return that.
        // time complexity : O(n)
        // space complexity : O(n) space used by the recursion stack 
        
        if(p.val < root.val && q.val < root.val) {
            // left search 
            return lowestCommonAncestor(root.left, p, q); 
        } else if(p.val > root.val && q.val > root.val) {
            // right seach 
            return lowestCommonAncestor(root.right, p, q); 
        } else {
            return root; // split point. 
        }
    }
}