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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>(); 
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i); 
        }
        return buildTree(preorder, 0, 0, inorder.length - 1,  inorderMap); 
    }
    public TreeNode buildTree(int[] preorder, int preIndex, int inLowIndex, int inHighIndex, Map<Integer, Integer> inorderMap) {
        if(preIndex >= preorder.length || inLowIndex > inHighIndex) {
            return null; 
        }
        //  if(preIndex >= preorder.length) {
        //     return null; 
        // }
        
        
        TreeNode root = new TreeNode(preorder[preIndex]); 
        int mid = inorderMap.get(root.val); 
        int numElementsOnLeft = (mid - inLowIndex) + 1; 
        
        root.left = buildTree(preorder, preIndex + 1, inLowIndex, mid - 1, inorderMap); 
        root.right = buildTree(preorder, preIndex + numElementsOnLeft, mid + 1, inHighIndex, inorderMap); 
        
        return root; 
    }
}