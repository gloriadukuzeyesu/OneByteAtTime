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
        
        List<List<Integer>> result = new ArrayList<>(); 
        if(root == null) return result; 
        bfs(root, result); 
        return result; 
    }
    public void bfs(TreeNode root, List<List<Integer>> result) {
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root); 
        while(!queue.isEmpty()) {
            int size = queue.size(); 
            List<Integer> listLevel = new ArrayList<>(); 
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll(); 
                 listLevel.add(curr.val); 
                if(curr.left != null) {
                    queue.offer(curr.left); 
                }
                if(curr.right != null) {
                    queue.offer(curr.right); 
                }
            }
            result.add(listLevel); 
        }
    }
}