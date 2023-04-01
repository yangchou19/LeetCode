package OfferTest;

public class offer18 {
    /**
     * 给定单向链表的头指针和一个要删除的节点的值，
     * 定义一个函数删除该节点。
     * 返回删除后的链表的头节点。
     */
    public ListNode deleteNode(ListNode head, int val) {
        ListNode headNode = new ListNode(-1);
        headNode.next = head;
        ListNode temp = headNode;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return headNode.next;
    }
}
