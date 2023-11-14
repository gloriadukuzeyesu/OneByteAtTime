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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Long> sums = new ArrayList<>(); 
        queue.add(root); 
        while(!queue.isEmpty()) {
            int size = queue.size(); 
            long sumLevel = 0; 
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll(); 
                sumLevel += curr.val; 
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                  queue.add(curr.right);  
                }
            }
            sums.add(sumLevel); 
        }
        Collections.sort(sums);
        
        if(k > sums.size()) return - 1; 
        
        return sums.get(sums.size() - k); 
    }
}