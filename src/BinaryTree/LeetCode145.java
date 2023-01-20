package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
    /**
     * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null) return result;
        result = postorder(root,result);
        return result;
    }
    public List<Integer> postorder(TreeNode treeNode, List<Integer> result){
        if (treeNode==null) return null;
        postorder(treeNode.left,result);
        postorder(treeNode.right,result);
        result.add(treeNode.val);
        return result;
    }
}
