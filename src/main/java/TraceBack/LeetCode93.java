package TraceBack;

import java.util.LinkedList;
import java.util.List;

public class LeetCode93 {
    /**
     * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
     * 给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，
     * 返回所有可能的有效 IP 地址，这些地址可以通过在 s 中插入'.' 来形成。你 不能重新排序或删除 s 中的任何数字。
     * 你可以按 任何 顺序返回答案。
     */
    List<String> result = new LinkedList<>();
    StringBuffer temp = new StringBuffer();
    public List<String> restoreIpAddresses(String s) {
        restoreIpAddressHelper(s,0,0);
        return result;
    }
    private void restoreIpAddressHelper(String s, int startIndex, int pointNum){
        if(pointNum == 3){
            if(isIp(s, startIndex, s.length()-1)) {
                result.add(temp.toString());
            }
            return;
        }
        for(int i=startIndex; i<s.length(); i++){
            if(isIp(s, startIndex, i)){
                s=s.substring(startIndex,i+1)+'.'+s.substring(i+1);
            }else break;
            pointNum++;
            restoreIpAddressHelper(s,i+2,pointNum);
            pointNum--;
            s = s.substring(0, i + 1) + s.substring(i + 2);// 回溯删掉逗点
        }
    }
    private boolean isIp(String s, int start, int end){
        if(start > end) return false;
        //开头为0不符合；
        if(s.charAt(start) == '0' && start != end) return false;
        //超过255；
        int num = 0;
        for(int i = start; i <= end; i++){
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num*10 + (s.charAt(i)-'0');
            if(num > 255) return false;
        }
        return true;
    }
}
