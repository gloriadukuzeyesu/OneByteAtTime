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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false; 
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root); 
        int depthX = -1; 
        int depthY = -2; 
        int level = 0; 
        while(!queue.isEmpty())  {
            int size = queue.size(); 
            for(int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll(); 
                if(currNode.left != null && currNode.right != null && currNode.left.val == x && currNode.right.val == y) {
                    return false; // same parent. 
                }
                if(currNode.left != null && currNode.right != null && currNode.left.val == y && currNode.right.val == x) {
                    return false; // same parent. 
                }
                if(currNode.val == x) {
                    depthX = level; 
                }
                if(currNode.val == y) {
                    depthY= level; 
                }
                
                // add to queu
                if(currNode.left != null) {
                    queue.add(currNode.left);
                }
                
                if(currNode.right != null) {
                    queue.add(currNode.right); 
                }
                
            }
            level++; 
        }
        return depthX == depthY; 
    }
}