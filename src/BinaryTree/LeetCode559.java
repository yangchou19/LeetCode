package BinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode559 {
    /**
     * 给定一个 N 叉树，找到其最大深度。
     * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
     */
    public int maxDepth(Node root) {
        if(root==null) return 0;
        List<Node> children = root.children;
        int maxChildDepth = 0;
        for(Node child : children){
            int childdepth = maxDepth(child);
            maxChildDepth = Math.max(childdepth,maxChildDepth);
        }
        return maxChildDepth+1;
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
