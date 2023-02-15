package Greed;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode714Test {

    @Test
    public void maxProfit() {
        LeetCode714 test = new LeetCode714();
        int[] prices = {1,3,2,8,4,9};
        test.maxProfit(prices,2);
    }
}