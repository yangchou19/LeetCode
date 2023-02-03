package BinaryTree;

public class LeetCode108 {
    /**
     * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
     * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }
    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if(left > right) return null;
        if(right-left ==1 ) return new TreeNode(nums[left]);

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, left, mid);
        node.right = sortedArrayToBST(nums, mid+1, right);
        return node;
    }
}
