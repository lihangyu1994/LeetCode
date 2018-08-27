package com.lhy.leetcode;

public class IsBalanced {
	/*#110. 平衡二叉树
	给定一个二叉树，判断它是否是高度平衡的二叉树。

	本题中，一棵高度平衡二叉树定义为：

	一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
	给定二叉树 [3,9,20,null,null,15,7]

		    3
		   / \
		  9  20
		    /  \
		   15   7
		返回 true 。

		示例 2:

		给定二叉树 [1,2,2,3,3,null,null,4,4]

		       1
		      / \
		     2   2
		    / \
		   3   3
		  / \
		 4   4
		返回 false*/
	public static void main(String[] args) {

	}

	public static boolean isBalanced(TreeNode root) {
		if (root == null) {
            return true;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        if (left - right > 1 || left - right < -1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
	}
	
	 /**
     * 求树的高度
     * @param n 树的根结点
     * @return 树的高度
     */
    private static int depth(TreeNode n) {
        if (n == null) {
            return 0;
        }  if (n.left == null && n.right == null) {
            return 1;
        } else {
            int left = depth(n.left);
            int right = depth(n.right);
            return 1 + (left > right ? left : right);
        }
    }
}
