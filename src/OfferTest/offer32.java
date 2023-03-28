package OfferTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class offer32 {
    /**
     * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     */
    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> nodeList = new ArrayList<Integer>();
        queue.add(root);
        nodeList.add(root.val);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null){
                queue.add(node.left);
                nodeList.add(node.left.val);
            }
            if(node.right != null){
                queue.add(node.right);
                nodeList.add(node.right.val);
            }
        }
        int[] result = new int[nodeList.size()];
        for(int i = 0; i<result.length;i++){
            result[i]= nodeList.get(i);
        }
        return result;
    }
}
