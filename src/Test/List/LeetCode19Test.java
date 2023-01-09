package List;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode19Test {

    @Test
    public void removeNthFromEnd() {
        LeetCode19 test = new LeetCode19();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        test.removeNthFromEnd(node1,2);


    }
}