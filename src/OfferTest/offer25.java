package OfferTest;

public class offer25 {
    /**
     * 输入两个递增排序的链表，
     * 合并这两个链表并使新链表中的节点仍然是递增排序的。
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode result = temp;
        while(l1!=null || l2!=null){
            int val1 = Integer.MAX_VALUE;
            int val2 = Integer.MAX_VALUE;
            if(l1!=null)  val1 = l1.val;
            if(l2!=null)  val2 = l2.val;
            if(val1 < val2){
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        return result.next;
    }
}
