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
class Pair {
    private TreeNode key; 
    private int val; 
    
    Pair(TreeNode key, int val){
        this.key = key;
        this.val = val; 
    }
    public TreeNode getKey(){
        return key; 
    }
    public int getValue() {
        return val; 
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        Stack<Pair> stack = new Stack<>(); 
        int maxDepth = 0;
        if(root != null) {
            stack.push(new Pair(root, 1));
        }
        while(!stack.isEmpty()) {
            Pair currentPair = stack.pop();
            TreeNode node = currentPair.getKey(); 
            int depth = currentPair.getValue(); 
            maxDepth = Math.max(maxDepth, depth); 
            if(node.left != null) {
                stack.push(new Pair(node.left, depth + 1)); 
            }
            if(node.right != null) {
                stack.push(new Pair(node.right, depth + 1)); 
            }
            
        }
        return maxDepth; 
        
    }
}