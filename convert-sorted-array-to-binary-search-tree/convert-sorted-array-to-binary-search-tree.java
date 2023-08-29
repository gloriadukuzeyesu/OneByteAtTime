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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBalancedBST(nums, 0, nums.length - 1);  
    }
    
//     private TreeNode buildBalancedBST(int[] nums, int l, int r){
//     if (l>r) return null;
//     if (l==r) return new TreeNode(nums[l]);
//     int mid = (l+r)/2;
//     TreeNode root = new TreeNode(nums[mid]);
//     root.left = buildBalancedBST(nums, l, mid-1);
//     root.right = buildBalancedBST(nums, mid+1, r);
//     return root;
//   }
    private TreeNode buildBalancedBST(int[] nums, int left, int right) {
        if(left > right) {
            return null; 
        }
        if(left == right) {
            return new TreeNode(nums[left]);
        }
        int mid = left + (right - left) / 2; 
        TreeNode root = new TreeNode (nums[mid]); 
        root.left = buildBalancedBST(nums, left, mid - 1); 
        root.right = buildBalancedBST(nums, mid + 1, right); 
        return root; 
    }
}