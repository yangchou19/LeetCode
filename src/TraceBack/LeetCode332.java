package TraceBack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode332 {
    /**
     * 给定一个机票的字符串二维数组 [from, to]，
     * 子数组中的两个成员分别表示飞机出发和降落的机场地点，
     * 对该行程进行重新规划排序。
     * 所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。
     */
    LinkedList<String> result = new LinkedList<>();
    private LinkedList<String> path = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
        path.add("JFK");
        boolean[] used = new boolean[tickets.size()];
        backTracking(tickets, used);
        return result;
    }

    public boolean backTracking(List<List<String>> tickets, boolean[] used) {
        if (path.size() == tickets.size() + 1) {
            result = new LinkedList(path);
            return true;
        }

        for (int i = 0; i < tickets.size(); i++) {
            if (!used[i] && tickets.get(i).get(0).equals(path.getLast())) {
                path.add(tickets.get(i).get(1));
                used[i] = true;

                if (backTracking(tickets, used)) {
                    return true;  // 找到叶节点就返回
                }

                used[i] = false;
                path.removeLast();
            }
        }
        return false;
    }
}
