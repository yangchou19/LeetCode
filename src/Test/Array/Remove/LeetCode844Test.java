package Array.Remove;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode844Test {

    @Test
    public void backspaceCompare() {
        String s = "bxj##tw";
        String t = "bxj###tw";
        LeetCode844 test = new LeetCode844();
        System.out.println(test.backspaceCompare(s,t));
    }
}