package BinaryTree;

public class LeetCode0111 {
    /**
     *给定一个二叉树，找出其最小深度。
     *最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     */
    public int minDepth(TreeNode root) {
        return minCompare(root);
    }

    public int minCompare(TreeNode root) {
        if (root==null) return 0;
        int leftDepth = minCompare(root.left);
        int rightDepth = minCompare(root.right);
        // 当一个左子树为空，右不为空，这时并不是最低点
        if(root.left==null && root.right!=null) return 1+rightDepth;
        // 当一个右子树为空，左不为空，这时并不是最低点
        if(root.left!=null && root.right==null) return 1+leftDepth;
        int depth = Math.min(leftDepth, rightDepth)+1;
        return depth;
    }
}
