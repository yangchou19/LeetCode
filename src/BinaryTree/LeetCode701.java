package BinaryTree;

public class LeetCode701 {
    /**
     * 给定二叉搜索树（BST）的根节点 root 和要插入树中的值 value ，将值插入二叉搜索树。
     * 回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        if(root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else if(root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
