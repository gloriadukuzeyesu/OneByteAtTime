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
    
    public int kthSmallest(TreeNode root, int k) {
        
        /*
        1. minHeap => descreasing order. root node has the minimum value in the tree
        priority queue => order elements based on natual ordering and using comparator
        first in first out. 
        sort as we go. by putting nodes in the the heap. 
        */
        // int counter = 0; 
        List<Integer> list = new ArrayList<>(); 
        
        // visit left 
       // recursive(root.left, counter, list);
        
        recursive(root, list); 
        
//         if(counter < k) {
//             // if the k number is not found visit right
//             recursive(root.right, counter, list); 
//             System.out.println("list: " + list);
//         }
        
// //         // return the k smalles. 
// //         for (int i = 0; i < k; i++) {
            
// //         }
        System.out.println(list);
        return list.get(k - 1);
        
    }
    
    public void recursive(TreeNode root,List<Integer> list) {
        // base case
        if(root == null) {
           return; 
        }
   
        // recursive case
        recursive(root.left,list);
        list.add(root.val); 
        recursive(root.right,list);
        
    
    }
}