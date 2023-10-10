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
    public int widthOfBinaryTree(TreeNode root) {        
        int maxCount = 0; 
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>(); 
        queue.add(new Pair<>(root,0)); 
        maxCount = queue.size(); 
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            int indexF = queue.peek().getValue();
            
            for(int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> curr = queue.poll();
                TreeNode currNode = curr.getKey();
                int currIndex = curr.getValue();
                
                if(currNode.left != null) {
                     queue.add(new Pair<>(currNode.left, currIndex * 2));
                }

                if(currNode.right != null) {
                    queue.add(new Pair<>(currNode.right, currIndex * 2 + 1));
                }
                
                int currWidth = currIndex - indexF + 1; 
                if(maxCount <  currWidth) {
                    maxCount = currWidth;
                }
            }
 
        }
        return maxCount;
    }
}