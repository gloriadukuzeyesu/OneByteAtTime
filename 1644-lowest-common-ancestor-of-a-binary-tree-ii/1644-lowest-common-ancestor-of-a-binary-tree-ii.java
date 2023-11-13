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
        boolean pExists = dfs(root, p);  // search if p exists using dfs
        boolean qExists = dfs(root, q); //search if q exists using dfs
        if(pExists && qExists) {
            return findCommon(root, p,q); // find common ancestor if both q and p exists. 
        }
        return null; // return null if either p or q does not exists. 
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