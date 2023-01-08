package Array.Loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode29Test {

    @Test
    public void spiralOrder() {
        LeetCode29 test = new LeetCode29();
        int matirx[][] = {{2,3,4},{5,6,7},{8,9,10},{11,12,13}};
        System.out.println(test.spiralOrder(matirx));
    }
}