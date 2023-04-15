package OfferTest;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;

public class Offer07 {
    int[] preorder;
    HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++) {
            dict.put(inorder[i], i);
        }
        return recur(0, 0, preorder.length-1);
    }
    public TreeNode recur(int root, int left, int right) { // index of root(preorder), index of left(inorder), index of right(inorder)
        if(left > right) return null;
        TreeNode node = new TreeNode(preorder[root]);
        Integer i = dict.get(preorder[root]);
        node.left = recur(root+1, left, i-1);
        node.right =recur(i-left+root+1, i+1, right);
        return node;
    }
}
