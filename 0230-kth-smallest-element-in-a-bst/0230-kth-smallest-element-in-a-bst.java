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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>(); 
        dfs(root, list); 
        return list.get(k - 1); 
    }
    public void dfs(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        dfs(root.left, list); 
        list.add(root.val); 
        dfs(root.right, list); 
    }
}