package Array.BinarySearch;

import Array.BinarySearch.Leetcode35;
import org.junit.Test;

import java.util.Arrays;

public class Leetcode35Test {
    Leetcode35 leetcode35 = new Leetcode35();
    @Test
    public void searchRange() {
        int[] nums = {1,3,5,5,5,6,7,8,9};
        int target = 5;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(leetcode35.searchRange(nums, target)));
    }

    @Test
    public void getRightBorder() {
    }

    @Test
    public void getLeftBorder() {
    }
}