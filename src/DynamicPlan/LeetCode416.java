package DynamicPlan;

public class LeetCode416 {
    /**
     * 给你一个 只包含正整数 的 非空 数组 nums 。
     * 请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等
     *
     *
     * 背包的体积为sum / 2
     * 背包要放入的商品（集合里的元素）重量为 元素的数值，价值也为元素的数值
     * 背包如果正好装满，说明找到了总和为 sum / 2 的子集。
     * 背包中每一个元素是不可重复放入。
     *
     */
    public boolean canPartition(int[] nums) {
        if(nums==null||nums.length==1) return false;
        int len = nums.length;
        int sum = 0;
        for(int num:nums){
            sum +=num;
        }
        if(sum%2 !=0) return false;
        int target = sum / 2;
        int dp[] = new int[len+1];
        dp[0] = 0;
        for(int i=0; i<len; i++){
            for(int j=target; j>=nums[i];j--){
                dp[j] = Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        return dp[target]==target; // dp[j]的数值一定是小于等于j的。
    }
}
