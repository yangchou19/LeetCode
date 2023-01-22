package BinaryTree;

import sun.reflect.generics.tree.Tree;

public class LeetCode100 {
    /**
     * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameChildren(p, q);
    }
    public boolean isSameChildren(TreeNode p, TreeNode q) {
        if(p ==null && q==null) return true;
        else if (p == null && q != null) return false;
        else if (p != null && q == null) return false;
        else if (p.val != q.val) return false;
        else return isSameChildren(p.left, q.left) && isSameChildren(p.right, q.right);
    }
}
