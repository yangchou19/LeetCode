package Char;

public class LeetCode05 {
    /**
     *请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     */
    public String replaceSpace(String s) {
        if(s.length()==0||s==null) return s;
        StringBuilder sb = new StringBuilder();
        //扩充空间，空格数量2倍
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)== ' '){
                sb.append("  ");
            }
        }
        //若是没有空格直接返回
        if(sb.length() == 0){
            return s;
        }
        int left = s.length() - 1;//左指针：指向原始字符串最后一个位置
        s += sb.toString();
        int right = s.length() - 1;//右指针：指向扩展字符串的最后一个位置
        char[] chars = s.toCharArray();
        while(left>=0){
            if(chars[left] == ' '){
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            }else{
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        return chars.toString();
    }
}
