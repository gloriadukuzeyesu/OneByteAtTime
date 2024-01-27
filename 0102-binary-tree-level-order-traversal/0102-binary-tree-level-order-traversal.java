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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>(); 
        if(root == null) return levels; 
        bfs(root, levels); 
        return levels; 
    }
    public void bfs(TreeNode root, List<List<Integer>> levels) {
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root); 
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>(); 
            int size = queue.size(); // 1
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.remove(); 
                level.add(node.val); 
                if(node.left != null) {
                    queue.add(node.left); 
                }
                if(node.right != null) {
                    queue.add(node.right); 
                 }
            }
            levels.add(level); 
        }
    }
}