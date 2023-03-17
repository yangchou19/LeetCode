package DynamicPlan;

public class LeetCode516 {
    //todo:未懂
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()+1][s.length()+1]; //字符串s在[i, j]范围内最长的回文子序列的长度为dp[i][j]。
        for(int i=s.length()-1; i>=0; i--){
            dp[i][i] = 1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j)==s.charAt(i)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
}
