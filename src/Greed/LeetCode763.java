package Greed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LeetCode763 {
    /**
     * 给你一个字符串 s 。我们要把这个字符串划分为尽可能多的片段，
     * 同一字母最多出现在一个片段中。
     * 注意，划分结果需要满足：将所有划分结果按顺序连接，得到的字符串仍然是 s 。
     * 返回一个表示每个字符串片段的长度的列表。
     */
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new LinkedList<>();
        char[] chars = s.toCharArray();
        int[] index = new int[26];
        for(int i = 0; i < chars.length; i++) {  //统计最大次数
            index[chars[i]-'a'] = i;
        }
        int idx=0, start=-1;
        for(int i = 0; i <chars.length;i++){
            idx = Math.max(idx, index[chars[i]-'a']);
            if(idx == i){
                list.add(idx - start);
                start = i;
            }
        }
        return list;
    }
}
