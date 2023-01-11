package List;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode nodeA = headA;
            ListNode nodeB = headB;
            if (headA==null || headB==null) return null;
            while (nodeA != nodeB){
                nodeA = nodeA==null ? headB : nodeA.next;
                nodeB = nodeB==null ? headA : nodeB.next;
            }
            return nodeA;
    }
}
