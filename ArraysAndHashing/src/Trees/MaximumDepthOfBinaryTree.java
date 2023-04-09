package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    // 1. Recursive way DFS O(n) time complexity
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth1(root.left);
        int rightMaxDepth = maxDepth1(root.right);

        if (leftMaxDepth > rightMaxDepth) {
            return leftMaxDepth + 1;
        } else {
            return rightMaxDepth + 1;
        }
    }

    /**
     * using BFS
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        int res= 0;
        if(root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int level = queue.size();
            res++;
            for(int i = 0; i < level; i++) {
                if(queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }

                queue.poll();
            }
        }
        return res;
    }

}
