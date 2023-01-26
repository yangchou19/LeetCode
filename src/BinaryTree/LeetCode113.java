package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113 {
    /**
     * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        List<Integer> path = new ArrayList<>();
        preorderdfs(root, targetSum, path, result);
        return result;

    }
    public void preorderdfs(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result){
        path.add(root.val);
        if(root.left == null && root.right == null) {
            // 找到了和为 targetsum 的路径
            if(targetSum - root.val == 0){
                result.add(new ArrayList<>(path));
            }
            return; // 如果和不为 targetsum，返回
        }
        if(root.left!=null){
            preorderdfs(root.left, targetSum-root.val,path,result);
            path.remove(path.size()-1);
        }
        if (root.right != null) {
            preorderdfs(root.right, targetSum - root.val,path,result);
            path.remove(path.size() - 1); // 回溯
        }
    }
}
