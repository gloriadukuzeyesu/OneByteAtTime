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

class Combination {
    TreeNode node; 
    int index; 
    public Combination(TreeNode node, int index) {
        this.node = node; 
        this.index = index; 
    }
    
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int maxWidth = 0;
        Queue<Combination> queue = new LinkedList<>();
        queue.add(new Combination(root, 0));

        while (queue.size() > 0) {
            Combination head = queue.peek();

            // iterate through the current level
            int currLevelSize = queue.size();
            Combination elem = null;
            for (int i = 0; i < currLevelSize; ++i) {
                elem = queue.poll();
                TreeNode node = elem.node;
                if (node.left != null)
                    queue.add(new Combination(node.left, 2 * elem.index));
                if (node.right != null)
                    queue.add(new Combination(node.right, 2 * elem.index + 1));
            }

            // calculate the length of the current level,
            // by comparing the first and last col_index.
            maxWidth = Math.max(maxWidth, elem.index - head.index + 1);
        }

        return maxWidth;
    }
}

