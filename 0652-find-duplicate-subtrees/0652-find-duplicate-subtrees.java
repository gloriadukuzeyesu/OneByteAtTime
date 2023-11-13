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
        Serialize(root, res, new HashMap<>()); 
        return res; 
    }
    public String Serialize (TreeNode root, List<TreeNode> res, Map<String, Integer> map) {
        if(root == null) {
            return "null"; 
        }
        String leftLeg = Serialize(root.left, res, map); 
        String rigthLeg = Serialize(root.right, res, map); 
        
        String serialize = root.val + "," + leftLeg + "," + rigthLeg; 
        map.put(serialize, map.getOrDefault(serialize, 0) + 1); 
        if(map.get(serialize) == 2) {
            res.add(root); 
        }
        return serialize; 
    }
}