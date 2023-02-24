package DynamicPlan;

public class LeetCode494 {
    /**
     * 给你一个整数数组 nums 和一个整数 target 。
     * 向数组中的每个整数前添加 '+' 或 '-' ，
     * 然后串联起所有整数，可以构造一个 表达式 ：
     * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，
     * 然后串联起来得到表达式 "+2-1" 。
     * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
     */
    public int findTargetSumWays(int[] nums, int target) {
        int sum =0;
        for(int num : nums) {
            sum+=num;
        }
        if(target > sum ) return 0;
        if((target + sum)%2 != 0) return 0;
        int size = (target+sum)/2;
        int[] dp = new int[size+1];
        dp[0] = 1;
        for(int i=0; i<dp.length; i++){
            for(int j=size; j>=nums[i];j--){
                dp[j] += dp[j-nums[i]];
            }
        }
        return dp[size];
    }
}
