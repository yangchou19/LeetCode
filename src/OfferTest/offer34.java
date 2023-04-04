package OfferTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class offer34 {
    List<List<Integer>> pathList = new LinkedList<List<Integer>>();
    LinkedList<Integer> path = new LinkedList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return pathList;
    }
    public void dfs(TreeNode node, int target) {
        if( node==null) return;
        path.add(node.val);
        target = target - node.val;
        if(0==target && node.left==null && node.right == null){
            pathList.add(new LinkedList(path));  // 创建新的列表，因为path是引用，后续的remove会删除其内容
            return;
        }
        dfs(node.left, target);
        dfs(node.right, target);
        path.removeLast();
    }
}
