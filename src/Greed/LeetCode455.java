package Greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LeetCode455 {
    /**
     * 对每个孩子 i，都有一个胃口值g[i]，
     * 这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j]。
     * 如果 s[j]>= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
     * 你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int index = g.length - 1;
        for (int i = s.length -1; i >= 0; i--){
            while(index >=0){
                if(s[i] >= g[index]){
                    result ++;
                    index --;
                    break;
                }
                index--;
            }
        }
        return result;
    }
}
