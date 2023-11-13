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
        boolean pExists = dfs(root, p); 
        boolean qExists = dfs(root, q); 
        if(pExists && qExists) {
            return findCommon(root, p,q);
        }
        return null; 
    } 
    public boolean dfs(TreeNode root, TreeNode target) {
        if(root == null) {
            return false; 
        }
        if(root == target) {
            return true;
        }
        return  dfs(root.left,target) || dfs(root.right,target); 
    }
    public TreeNode findCommon(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root; 
        TreeNode left = findCommon(root.left, p, q); 
        TreeNode right = findCommon(root.right, p, q); 
        return left == null ? right : right == null ? left : root; 
    }
    
}