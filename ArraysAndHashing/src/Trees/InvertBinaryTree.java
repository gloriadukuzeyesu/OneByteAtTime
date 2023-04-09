package Trees;

/* The solution is a simple recursive approach:
 - Call invert for left-subtree.
 - Call invert for right-subtree.
 - Swap left and right subtrees.*/
public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * recursive invert is same as mirror the root will not change,
     *  but visit every node and swap its left c=node with its right node and so forth
     * @param root root of the tree
     * @return the root after being inverted
     */

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }
}
