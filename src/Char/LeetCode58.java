package Char;

public class LeetCode58 {
    /**
     *字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
     * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     */
    public String reverseLeftWords(String s, int n) {
        if(s==null || s.length()==0) return s;
        int len = s.length();
        StringBuffer ans = new StringBuffer(len);
        StringBuffer front = new StringBuffer();
        StringBuffer back = new StringBuffer();
        front.append(s.substring(0,n));
        ans.append(front.reverse());
        back.append(s.substring(n,len));
        ans.append(back.reverse());
        ans.reverse();
        return ans.toString();
    }
}
