package OfferTest;

public class offer52 {
    /**
     * 输入两个链表，
     * 找出它们的第一个公共节点。
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA, tempB = headB;
        int lenA=0, lenB=0;
        while (tempA!=null){ // A的长度
            lenA++;
            tempA = tempA.next;
        }
        while (tempB!=null){ // B的长度
            lenB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lenA > lenB){
            int gap = lenA - lenB;
            while (gap>0){
                tempA = tempA.next;
                gap--;
            }
        }else{
            int gap = lenB - lenA;
            while(gap > 0){
                tempB = tempB.next;
                gap--;
            }
        }
        while(tempA!=null && tempB != null) {
            if(tempA==tempB) return tempA;
            else{
                tempA = tempA.next;
                tempB = tempB.next;
            }
        }
        return null;
    }
}
