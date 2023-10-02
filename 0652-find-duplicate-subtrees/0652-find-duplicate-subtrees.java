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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>(); 
        serialize(root, new HashMap<>(), res);
        return res; 
    }
    public String serialize(TreeNode node, Map<String, Integer> count, List<TreeNode> res) {
        // pre order traversal
        if(node == null) {
            return "null";
        }
        String leftSubtree = serialize(node.left, count, res);
        String rightSubTree = serialize(node.right, count, res);
        // check if we 've seen this before
        String repre = node.val + "," + leftSubtree + "," + rightSubTree;
        count.put(repre, count.getOrDefault(repre, 0) + 1); 
        if(count.get(repre) == 2) {
            res.add(node);            
        }
        return repre;
    }
    
}