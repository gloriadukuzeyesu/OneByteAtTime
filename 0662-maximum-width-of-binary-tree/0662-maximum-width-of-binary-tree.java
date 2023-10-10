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
        // BFS traverl
        
        // create a queue and maxcount
        // visit nodes level by level
        // update the maxCount based on the nodes in the queu 
        
        int maxCount = 0; 
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>(); 
        
        queue.add(new Pair<>(root,1)); 
        
        maxCount = queue.size(); 
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            Pair<TreeNode, Integer> head = queue.getFirst();
            int indexF = head.getValue();
            
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
            
            //maxCount = Math.max(maxCount,queue);   
        }
        return maxCount;
    }
}