package BinaryTree;

public class LeetCode404 {
    /**
     * 给定二叉树的根节点 root ，返回所有左叶子之和。
     */
    int value=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int leftValue = sumOfLeftLeaves(root.left);
        int rightValue = sumOfLeftLeaves(root.right);
        int midValue = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            midValue = root.left.val;
        }
        int sum = midValue + leftValue + rightValue;  // 中
        return sum;
    }
}
