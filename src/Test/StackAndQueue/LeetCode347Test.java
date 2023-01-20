package StackAndQueue;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode347Test {

    @Test
    public void topKFrequent() {
        LeetCode347 test = new LeetCode347();
        int[] nums = {1,1,1,2,2,3};
        test.topKFrequent(nums,2);
    }
}