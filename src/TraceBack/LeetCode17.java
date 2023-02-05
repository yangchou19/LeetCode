package TraceBack;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {
    /**
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     */
    //设置全局列表存储最后的结果
    List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //迭代处理
        backTracking(digits, numString, 0);
        return list;
    }
    //每次迭代获取一个字符串，所以会设计大量的字符串拼接，所以这里选择更为高效的 StringBuild
    StringBuilder temp = new StringBuilder();
    private void backTracking(String digits, String[] numString, int num){
        if(num == digits.length()){
            list.add(temp.toString());
            return;
        }
        //str 表示当前num对应的字符串
        String str = numString[digits.charAt(num) - '0'];
        for(int i=0; i< str.length(); i++){
            temp.append(str.charAt(i));
            backTracking(digits,numString,num+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
