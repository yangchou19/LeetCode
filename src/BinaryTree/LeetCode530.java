package BinaryTree;

import sun.reflect.generics.tree.Tree;

public class LeetCode530 {
    /**
     * 给你一个二叉搜索树的根节点 root ，
     * 返回 树中任意两不同节点值之间的最小差值 。
     * 差值是一个正数，其数值等于两值之差的绝对值。
     */
    TreeNode node;
    Integer min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return min;
    }
    public void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        if(node != null){
            min = Math.min(min, root.val - node.val);
        }
        node = root;
        traverse(root.right);
    }

}
