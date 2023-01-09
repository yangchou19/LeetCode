package List;

public class LeetCode24 {
    /**
     * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
     * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
     */

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode swapPairs(ListNode head) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode temp = dummyhead;
        while (temp.next != null && temp.next.next != null) {
            ListNode pre = temp.next;
            ListNode cur = temp.next.next;
            temp.next = cur;
            pre.next = cur.next;
            cur.next = pre;
            temp = pre;
        }
        return dummyhead.next;
    }
}
