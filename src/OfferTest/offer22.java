package OfferTest;

public class offer22 {
    /**
     * 输入一个链表，输出该链表中倒数第k个节点。
     * 为了符合大多数人的习惯，
     * 本题从1开始计数，
     * 即链表的尾节点是倒数第1个节点。
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode preNode = new ListNode(-1);
        preNode.next = head;
        ListNode tailNode  = preNode;
        while (k>0){
            tailNode = tailNode.next;
            k--;
        }
        while (tailNode.next !=null){
            preNode = preNode.next;
            tailNode = tailNode.next;
        }
        return preNode.next;
    }
}
