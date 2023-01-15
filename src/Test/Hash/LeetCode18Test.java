package Hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode18Test {

    @Test
    public void fourSum() {
        LeetCode18 test = new LeetCode18();
        int[] nums = {1,-2,-5,-4,-3,3,3,5};
        test.fourSum(nums,-11);
    }
}