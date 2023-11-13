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
    int recordedDepth = -1; 
    boolean isCousin = false; 
    
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, 0, x, y);
        return isCousin; 
    }
    public boolean dfs(TreeNode node, int depth, int x, int y) {
        if(node == null) {
            return false; 
        }
        // Don't go beyond the depth restricted by the first node found.
        if(recordedDepth != -1 && depth > recordedDepth) {
            return false; 
        }
        
        if(node.val == x || node.val == y) {
            // record this depth 
            if(recordedDepth == -1) {
                recordedDepth = depth; 
            }
            return recordedDepth == depth; 
        }  
        
        boolean left = dfs(node.left, depth + 1, x, y); 
        boolean right = dfs(node.right, depth + 1, x, y);
        
        if(left && right && recordedDepth != depth + 1) {
            isCousin = true; 
        }
        return left || right; 
    }
}