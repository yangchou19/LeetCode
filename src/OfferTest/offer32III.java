package OfferTest;

import java.util.*;

public class offer32III {
    /**
     * 请实现一个函数按照之字形顺序打印二叉树，
     * 即第一行按照从左到右的顺序打印，
     * 第二层按照从右到左的顺序打印，
     * 第三行再按照从左到右的顺序打印，其他行以此类推。
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean turned = false;
        while(!queue.isEmpty()){
            Deque<Integer> nodes = new LinkedList<Integer>();
            int currentLevelSize = queue.size();
            for(int i=0;i<currentLevelSize;i++) {
                TreeNode node = queue.poll();
                if(turned==true) {
                    nodes.addFirst(node.val);
                }else{
                    nodes.addLast(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            if(!nodes.isEmpty()) result.add(new LinkedList<Integer>(nodes));
            turned = !turned;
        }
        return result;
    }
}
