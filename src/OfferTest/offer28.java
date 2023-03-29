package OfferTest;

public class offer28 {
    /**
     * 请实现一个函数，
     * 用来判断一棵二叉树是不是对称的。
     * 如果一棵二叉树和它的镜像一样，那么它是对称的。
     */
    public boolean isSymmetric(TreeNode root) {
        return overTurn(root.left, root.right);
    }
    boolean overTurn(TreeNode left, TreeNode right) {
        if(left==null && right!=null) return false;
        else if (left != null && right == null) return false;
        else if (left == null && right == null) return true;
        if(left.val!=right.val) return false;
        return overTurn(left.left, right.right) && overTurn(left.right, right.left);
    }
}
