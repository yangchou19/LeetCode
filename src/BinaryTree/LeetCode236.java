package BinaryTree;

public class LeetCode236 {
    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root == p || root == q || root == null ) return root;
      TreeNode left = lowestCommonAncestor(root.left, p, q);
      TreeNode right = lowestCommonAncestor(root.right, p, q);

      if(left != null || right != null) return root;
      if(left == null || right != null) return right;
      if(left != null || right == null) return left;
      else return null;
    }
}
