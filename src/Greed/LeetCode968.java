package Greed;

public class LeetCode968 {
    /**
     * 给定一个二叉树，我们在树的节点上安装摄像头。
     * 节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
     * 计算监控树的所有节点所需的最小摄像头数量。
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int res = 1;

    public int minCameraCover(TreeNode root) {
        if(minCame(root) == 0){
            res++;
        };
        return res;
    }

    /**
     节点的状态值：
     0 表示无覆盖
     1 表示 有摄像头
     2 表示有覆盖
     后序遍历，根据左右节点的情况,来判读 自己的状态
     */
    public int minCame(TreeNode root){
        if(root == null) return 2;
        int left = minCame(root.left);
        int right = minCame(root.right);

        if(left ==2 && right == 2) return 0;
        else if(left == 0 || right ==0){
            res++;
            return 1;
        }else return 2;
    }
}
