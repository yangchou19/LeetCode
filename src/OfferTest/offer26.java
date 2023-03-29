package OfferTest;

public class offer26 {
    /**
     * 输入两棵二叉树A和B，判断B是不是A的子结构。
     */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null) return false;
        return recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }
    boolean recur(TreeNode A, TreeNode B) {  // 判定B是否是A的子结构
        if(B == null) return true;
        if(A == null || A.val!=B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
