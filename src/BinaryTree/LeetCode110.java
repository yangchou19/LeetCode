package BinaryTree;

public class LeetCode110 {
    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     */
public boolean isBalanced(TreeNode root) {
    return getHeight(root) == -1 ? false : true;
}
public int getHeight(TreeNode root) {
    if (root==null) return 0;
    int leftDepth = getHeight(root.left);
    if (leftDepth == -1) return -1;
    int rightDepth = getHeight(root.right);
    if (rightDepth == -1) return -1;
    int depth = Math.max(leftDepth, rightDepth)+1;
    return Math.abs(leftDepth - rightDepth) > 1 ? -1: Math.max(leftDepth,rightDepth)+1;
}
}
