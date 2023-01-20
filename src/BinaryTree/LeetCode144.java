package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode144 {
    /**
     * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null) return result;
        result = preorder(root,result);
        return result;
    }

    public List<Integer> preorder(TreeNode treeNode, List<Integer> result){
        if (treeNode==null) return null;
        result.add(treeNode.val);
        preorder(treeNode.left,result);
        preorder(treeNode.right,result);
        return result;
    }

    public List<Integer> preorderTraversalStack(TreeNode root){
        List<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root!=null) stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node != null){
                stack.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if(node.right!=null) stack.push(node.right); // 添加右节点（空节点不入栈）
                if(node.left!=null) stack.push(node.left); // 添加左节点（空节点不入栈）
                stack.push(node);  // 添加中节点
                stack.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。
            } else {
                stack.pop(); //
                node = stack.peek();
                stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }
}
