package Char;

public class LeetCode541 {
    /**
     * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     */
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int len = s.length();
        int index = 0;
        while(index < len) {
            StringBuilder temp = new StringBuilder();
            if(index+k >= len){
                temp.append(s.substring(index, len));
                ans.append(temp.reverse());
                break;
            }else if(index+k <= len && index+2*k >len) {
                temp.append(s.substring(index, index+k));
                ans.append(temp.reverse());
                ans.append(s.substring(index+k,len));
                index = len;
            }else {
                temp.append(s.substring(index, index+k));
                ans.append(temp.reverse());
                ans.append(s.substring(index+k,index+2*k));
                index = index + 2*k;
            }
        }
        return ans.toString();
    }
}
