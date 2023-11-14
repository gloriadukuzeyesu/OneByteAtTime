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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> idxMap = new HashMap<>(); 
        for(int i = 0; i < inorder.length; i++) {
            idxMap.put(inorder[i], i); 
        }
       return buildTreeHelper(postorder, idxMap, 0, inorder.length - 1, postorder.length - 1);
    }
    
    
    public TreeNode buildTreeHelper(int[] postorder, Map<Integer, Integer> idxMap,
                                    int inLeft, int inRight, int postIdx) {
        // If there are no elements to construct subtrees
        if (inLeft > inRight || postIdx < 0)
            return null;

        // Pick up postIdx element as a root
        int rootVal = postorder[postIdx];
        TreeNode root = new TreeNode(rootVal);

        // Root splits inorder list into left and right subtrees
        int index = idxMap.get(rootVal);

        // Recursion 
        // Build the right subtree
        root.right = buildTreeHelper(postorder, idxMap, index + 1, inRight, postIdx - 1);
        // Build the left subtree
        root.left = buildTreeHelper(postorder, idxMap, inLeft, index - 1, postIdx - (inRight - index) - 1);

        return root;
    }
}