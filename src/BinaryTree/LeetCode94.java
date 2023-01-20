package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    /**
     * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorder(root,result);
        return result;
    }

    public List<Integer> inorder(TreeNode root, List<Integer> result){
        if(root == null) return null;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);

        return result;
    }
}
