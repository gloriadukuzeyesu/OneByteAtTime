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
        if(p.val <= root.val && root.val <= q.val) {
            return root; 
        }
        if(p.val >= root.val && root.val >= q.val) {
            return root; 
        }
        TreeNode leftCheck = lowestCommonAncestor(root.left, p, q); 
        if(leftCheck == null) {
            return lowestCommonAncestor(root.right, p, q); 
        }
        return leftCheck; 
    }
}