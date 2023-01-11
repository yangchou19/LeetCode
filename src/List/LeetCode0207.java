package List;

public class LeetCode0207 {
    /**
     *给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
     * 如果两个链表不存在相交节点，返回 null 。
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            lengthA ++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lengthB ++;
            tempB = tempB.next;
        }

        int gap = lengthA-lengthB;
        ListNode compA = headA;
        ListNode compB = headB;
        if(gap>=0) {
            for(int i=0; i<gap; i++) {
                compA = compA.next;
            }
        }else{
            gap = -gap;
            for(int i=0; i<gap; i++) {
                compB = compB.next;
            }
        }
        while(compA != null && compB != null){
            if(compA == compB ){
                return compA;
            }
            compA = compA.next;
            compB = compB.next;
        }
        return null;
    }
}
