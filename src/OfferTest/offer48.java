package OfferTest;

import java.util.HashMap;
import java.util.HashSet;

public class offer48 {
    /**
     * 请从字符串中找出一个最长的不包含重复字符的子字符串，
     * 计算该最长子字符串的长度。
     */
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put(s.charAt(0), 0);
        int result = 1;
        for(int i = 1; i < dp.length; i++){
            int index = map.getOrDefault(s.charAt(i),-1); // 获取重读的index
            map.put(s.charAt(i), i); // 放入索引i;
            if((i-index)>dp[i-1]) dp[i] = dp[i-1] + 1;
            else dp[i] = i - index;
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
