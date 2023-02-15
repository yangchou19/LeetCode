package Greed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LeetCode56 {
    /**
     * 以数组 intervals 表示若干个区间的集合，
     * 其中单个区间为 intervals[i] = [starti, endi] 。
     * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，
     * 该数组需恰好覆盖输入中的所有区间 。
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= end){
                // 更新最大右界
                end = Math.max(intervals[i][1],end);
            }else {
                res.add(new int[]{start, end});
                // 更新start
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][]);
    }
}
