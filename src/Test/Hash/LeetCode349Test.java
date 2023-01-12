package Hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode349Test {

    @Test
    public void intersection() {
        LeetCode349 test = new LeetCode349();
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(test.intersection(num1, num2));
    }
}