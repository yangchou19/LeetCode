package Array.MiniLengthArray;

import Array.Remove.LeetCode844;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode209Test {

    @Test
    public void minSubArrayLen() {
        int target = 7;
        int nums[] = {2,3,1,2,4,3};
        LeetCode209 test = new LeetCode209();
        System.out.println(test.minSubArrayLen(target,nums));
    }
}