package BinaryTree;

public class LeetCode111 {
    /**
     * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
     */
    public boolean isSymmetric(TreeNode root) {
        return compareRL(root.left, root.right);
    }

    private boolean compareRL(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        else if(left != null && right == null) return false;
        else if(left == null && right != null) return false;
        else if(left.val!=right.val) return false;
        else  return compareRL(left.left, right.right)&&compareRL(left.right, right.left);
    }
}
