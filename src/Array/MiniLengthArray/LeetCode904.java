package Array.MiniLengthArray;

import java.util.HashMap;
import java.util.Map;

public class LeetCode904 {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>(); // 目前的键值对

        int left = 0, ans = 0;
        for (int right = 0; right < n; ++right) { // 开始搜索
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);  // 放入键值对
            while (cnt.size() > 2) {  // 最小的采摘树值 ，移动left
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if (cnt.get(fruits[left]) == 0) {
                    cnt.remove(fruits[left]); // 移除不符合的树
                }
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
