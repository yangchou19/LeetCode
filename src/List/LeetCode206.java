package List;

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    /**
     * 递归法
     */
    public ListNode reverseListRec(ListNode head) {
        return reverse(null,head);
    }

    public ListNode reverse(ListNode pre, ListNode cur){
        if (cur == null) return pre;
        ListNode temp = cur.next;
        cur.next = pre;
        pre = cur;
        cur = temp;
        return reverse(pre, cur);
    }
}
