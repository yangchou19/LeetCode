package BinaryTree;

import static sun.swing.MenuItemLayoutHelper.max;

public class LeetCode104 {
    /**
     *给定一个二叉树，找出其最大深度。
     *二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     */
    public int maxDepth(TreeNode root) {
        return maxLeftRightDepth(root);
    }
    public int maxLeftRightDepth(TreeNode root) {
        if(root == null) return 0;
        int leftdepth = maxLeftRightDepth(root.left);
        int rightdepth = maxLeftRightDepth(root.right);
        int depth = max(leftdepth,rightdepth)+1;
        return depth;
    }
}
