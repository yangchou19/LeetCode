package OfferTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class offer36 {
    /**
     * 输入一棵二叉搜索树，
     * 将该二叉搜索树转换成一个排序的循环双向链表。
     * 要求不能创建任何新的节点，
     * 只能调整树中节点指针的指向。
     */
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    void dfs(Node cur){
        if(cur==null) return;
        dfs(cur.left);  // 最左边的节点
        if(pre == null) head = cur;  // head指向头结点
        else pre.right = cur;
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
}
