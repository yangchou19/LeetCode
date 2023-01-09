package List;

public class LeetCode19 {
    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode indexN = head;
        ListNode temp = dummy;
        int count = 0;
        while (count < n ) {  // 相差n个节点
            indexN = indexN.next;
            count++;
        }
        while (indexN != null) {
            temp = temp.next;
            indexN = indexN.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}
