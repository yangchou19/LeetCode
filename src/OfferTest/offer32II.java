package OfferTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32II {
    /**
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> nodeList = new ArrayList<Integer>();
        queue.add(root);
        nodeList.add(root.val);
        result.add(nodeList);
        while(!queue.isEmpty()){
            ArrayList<Integer> nodes = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for(int i=0;i<currentLevelSize;i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                    nodes.add(node.left.val);
                }
                if(node.right != null){
                    queue.add(node.right);
                    nodes.add(node.right.val);
                }
            }
            if(!nodes.isEmpty()) result.add(nodes);
        }
        return result;
    }

}
