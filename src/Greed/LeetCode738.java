package Greed;

public class LeetCode738 {
    /**
     * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，
     * 同时这个整数需要满足其各个位数上的数字是单调递增。
     */
    public int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        int start = c.length;
        for (int i = c.length -1 ; i > 0; i--) {
            if(c[i] < c[i-1]){
                c[i-1] --;
                c[i] = '9';
                start = i+1;
            }
        }
        for (int i=start; i <= c.length-1; i++){
            c[i] = '9';
        }
        return Integer.parseInt(String.valueOf(c));
    }
}
