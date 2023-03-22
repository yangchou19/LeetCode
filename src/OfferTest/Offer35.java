package OfferTest;

import java.util.HashMap;

public class Offer35 {
    /**
     * 请实现 copyRandomList 函数，复制一个复杂链表。
     * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，
     * 还有一个 random 指针指向链表中的任意节点或者 null。
     */
    HashMap<Node, Node> nodeHash = new HashMap<Node, Node>(); // 避免重复
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if(!nodeHash.containsKey(head)){
            Node newNode = new Node(head.val);
            nodeHash.put(head, newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);

        }
        return nodeHash.get(head);
    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
