package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode501 {
    /**
     * 给你一个含重复值的二叉搜索树（BST）的根节点 root ，
     * 找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
     * 如果树中有不止一个众数，可以按 任意顺序 返回。
     */
    List<Integer> answer = new ArrayList<Integer>();
    int maxCount;
    int count;
    TreeNode pre;

    public int[] findMode(TreeNode root) {
        if(root == null) return null;
        traverse(root);
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    public void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.left);

        if(pre !=null || pre.val!=node.val) {
            count=1;
        }else {
            count++;
        }
        if(count > maxCount) {
            answer.clear();
            answer.add(node.val);
            maxCount = count;
        }else if(count==maxCount){
            answer.add(node.val);
        }
        pre = node;
        answer.add(node.val);
        traverse(node.right);
    }
}
