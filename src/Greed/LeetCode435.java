package Greed;

import java.util.Arrays;

public class LeetCode435 {
    /**
     * 给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。
     * 返回 需要移除区间的最小数量，使剩余区间互不重叠 。

     */
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int overlap = 0;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < intervals[i-1][1]){ // 有重叠

                overlap++;
            }else {
                intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
                continue;
            }
        }
        return overlap;
    }
}
