package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class LeetCode126 {
    /**
     * 给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历，
     * postorder 是同一棵树的后序遍历，请你构造并返回这颗 二叉树 。
     */
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return findNode(inorder,0,inorder.length, postorder,0,postorder.length);
    }
    public TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
        // 参数里的范围都是前闭后开
        if(inBegin >= inEnd || postBegin >= postEnd) return null;
        int partitionIndex = map.get(postorder[postEnd-1]);
        TreeNode root = new TreeNode(inorder[partitionIndex]);  //构造节点
        int leftlen = partitionIndex - inBegin;
        root.left = findNode(inorder, inBegin, partitionIndex, postorder, postBegin, postBegin+leftlen);
        root.right = findNode(inorder, partitionIndex+1, inEnd, postorder, postBegin+leftlen, postEnd-1);
        return root;
    }
}
