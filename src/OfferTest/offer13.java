package OfferTest;

public class offer13 {
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        return dfs(m, n, k, 0,0);
    }
    int getNumSum(int m) {
        int result = 0;
        while(m !=0){
            int temp = m % 10;
            result = result + temp;
            m = m / 10;
        }
        return result;
    }
    public int dfs(int m, int n, int k, int si, int sj){
        if(si >=m||sj>=n || (getNumSum(si)+getNumSum(sj))>k || visited[si][sj]) return 0;
        visited[si][sj] = true;
        return 1 + dfs(m,n,k,si+1,sj) + dfs(m,n,k,si,sj+1);
    }
}
