package BinaryTree;

public class LeetCode112 {
    /**
     * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        targetSum = targetSum - root.val;
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        if (root.left != null) {
            boolean left = hasPathSum(root.left, targetSum);
            if (left) {      // 已经找到
                return true;
            }
        }

        if (root.right != null) {
            boolean right = hasPathSum(root.right, targetSum);
            if (right) {     // 已经找到
                return true;
            }
        }
        return false;
    }
}
