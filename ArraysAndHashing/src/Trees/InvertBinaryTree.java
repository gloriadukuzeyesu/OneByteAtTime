package Trees;

import com.sun.source.tree.Tree;

/* The solution is a simple recursive approach:
 - Call invert for left-subtree.
 - Call invert for right-subtree.
 - Swap left and right subtrees.*/
public class InvertBinaryTree {
    /**
     * recursive invert is same as mirror the root will not change,
     *  but visit every node and swap its left c=node with its right node and so forth
     * @param root root of the tree
     * @return the root after being inverted
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode sol = invertTree(root);
        System.out.println(sol.val);


    }
}
