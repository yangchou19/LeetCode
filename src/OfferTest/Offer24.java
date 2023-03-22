package OfferTest;

public class Offer24 {
    /**
     * 定义一个函数，
     * 输入一个链表的头节点，
     * 反转该链表并输出反转后链表的头节点。
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode cur = head;
        ListNode pre = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            cur = next;
            pre = cur;
        }
        return pre;
    }
}
