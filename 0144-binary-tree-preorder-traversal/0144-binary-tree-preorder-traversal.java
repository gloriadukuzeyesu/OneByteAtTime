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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>(); 
        if(root == null) {
            return res; 
        }
        Stack<TreeNode> stack = new Stack<>(); 
        stack.add(root);
        
        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop(); 
            if(curr != null) {
                res.add(curr.val); 
                stack.push(curr.right);
                stack.push(curr.left); 
            }
        }
        return res; 
    }
    // public void preOrder(TreeNode root, List<Integer> res) {
    //     if(root == null) {
    //         return; 
    //     }
    //     res.add(root.val); 
    //     preOrder(root.left, res); 
    //     preOrder(root.right, res); 
    // }
}