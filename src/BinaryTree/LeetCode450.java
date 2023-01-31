package BinaryTree;

public class LeetCode450 {
    /**
     * 给定一个二叉搜索树的根节点 root 和一个值 key，
     * 删除二叉搜索树中的 key 对应的节点，
     * 并保证二叉搜索树的性质不变。
     * 返回二叉搜索树（有可能被更新）的根节点的引用。
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root, key);
    }

    private TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val < key) root.right =  delete(root.right, key);
        else if (root.val > key) root.left = delete(root.left, key);
        else {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            TreeNode temp = root.right;
            while(temp.left != null){
                temp = temp.left;
            }
            root.val = temp.val;
            root.right = delete(root.right, temp.val);
        }
        return root;
    }
}
