package BinaryTree;

public class LeetCode226 {
    /**
     * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        swapChildren(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    private void swapChildren(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
