package com.lhy.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
	
/*	
 * 	107. 二叉树的层次遍历 
 *  II给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

	例如：
	给定二叉树 [3,9,20,null,null,15,7],

	    3
	   / \
	  9  20
	    /  \
	   15   7
	返回其自底向上的层次遍历为：

	[
	  [15,7],
	  [9,20],
	  [3]
	]*/

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> currentList = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node != null) {
					currentList.add(node.val);
					queue.add(node.left);
					queue.add(node.right);
				}
			}
			if (!currentList.isEmpty()) {
				result.add(0, currentList);
			}
		}
		return result;
	}

}
