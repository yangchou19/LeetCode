package DynamicPlan;

import java.util.HashSet;
import java.util.List;

public class LeetCode139 {
    /**
     * 给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<String>(wordDict);
        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;

        for(int i = 1; i <=s.length(); i++) {
            for(int j=0;j<i;j++){
                String word = s.substring(j, i);
                if(set.contains(word)&&dp[j]){
                    dp[i]=true;
                }
            }
        }
        return dp[s.length()];
    }
}
