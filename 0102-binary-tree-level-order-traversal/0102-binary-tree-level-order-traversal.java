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
        List<List<Integer>> resList = new ArrayList<>(); 
        if(root == null) return resList;
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer>subList = new ArrayList<>();
            for(int i = 0;i < size; i++) {
                TreeNode node = queue.poll();
                subList.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                 if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            resList.add(subList);
        } 
        return resList; 
    }
}