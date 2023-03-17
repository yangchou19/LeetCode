package DynamicPlan;

public class LeetCode392 {
    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     */
    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        int same = 0;
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] =Math.max(dp[i][j-1],dp[i-1][j]);
                }
                same = Math.max(same,dp[i][j]);
            }
        }
        return same>=s.length()?true:false;
    }
}
