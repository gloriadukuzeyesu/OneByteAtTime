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
     int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathFinder(root);
        return maxSum;  
    }
    private int maxPathFinder(TreeNode root) {
        if(root == null) {
            return 0; 
        }
        
        // if the sum from the left is negative, take 0
        int sumFromLeftLeg = Math.max(maxPathFinder(root.left),0); 
        int sumFromRightLeg = Math.max(maxPathFinder(root.right),0); 
        
        // update the maxSum ( left + right + root.va)
        maxSum = Math.max( maxSum, (sumFromLeftLeg + sumFromRightLeg + root.val));
        
        // return the max sum from the root when there is a split. 
        return Math.max( (sumFromLeftLeg + root.val), (sumFromRightLeg + root.val)); 
        
    }
}