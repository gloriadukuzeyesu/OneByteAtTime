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
    Map<Integer, Integer> map = new HashMap<>(); 
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length < 1 || inorder.length < 1) {
            return null; 
        }
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i); 
        }
        return builder (preorder, 0, 0, inorder.length - 1); 
        
    }
    
    TreeNode builder (int[]preorder, int preIndex, int inLow, int inHigh) {
        if(preIndex > preorder.length - 1 || inLow > inHigh) {
            return null; 
        }
        System.out.println(preIndex);
        int c = preorder[preIndex];
        
        TreeNode root = new TreeNode(preorder[preIndex]); 
        int mid = map.get(root.val); 
        
        root.left = builder (preorder, preIndex + 1, inLow, mid - 1); 
        root.right = builder (preorder, preIndex + (mid - inLow) + 1, mid + 1, inHigh); 
        return root;
        
    }
}