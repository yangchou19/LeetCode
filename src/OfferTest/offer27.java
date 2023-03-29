package OfferTest;

import sun.reflect.generics.tree.Tree;

public class offer27 {
    /**
     * 请完成一个函数，
     * 输入一个二叉树，
     * 该函数输出它的镜像。
     */
    public TreeNode mirrorTree(TreeNode root) {
        return Overturn(root);
    }
    TreeNode Overturn (TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
        Overturn(root.left);
        Overturn(root.right);
        return root;
    }
}
