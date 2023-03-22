package OfferTest;

import java.util.Stack;

public class Offer06 {
    /**
     * 输入一个链表的头节点，
     * 从尾到头反过来返回每个节点的值（用数组返回）。
     */
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        int len = 0;
        while(head!=null){
            stack.push(head.val);
            head = head.next;
            len++;
        }
        int[] result = new int[len];
        for(int i=0;i<len;i++){
            result[i] = stack.pop();
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
}
