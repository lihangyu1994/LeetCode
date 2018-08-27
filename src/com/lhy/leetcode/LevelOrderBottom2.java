package com.lhy.leetcode;

import java.util.ArrayList;
import java.util.List;

/*#107. 二叉树的层次遍历 II
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

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
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class LevelOrderBottom2 {

	public static void main(String[] args) {

	}

	public static List<List<Integer>> levelOrderBottom2(TreeNode root) {
		    List<List<Integer>> nodeData = new ArrayList<List<Integer>>();
	        if(root==null){
	        	return nodeData;
	        };
	        List<TreeNode> nodeList = new ArrayList<TreeNode>();
	        nodeList.add(root);
	        int start = 0;
	        int last = 1; //value 1 is for the 0 level
	        while(start<nodeList.size()){
	            last = nodeList.size();//update the last value of the new level
	            List<Integer> tempList = new ArrayList<Integer>(); //store the node data in every level
	            while(start < last){
	                TreeNode tempNode = (TreeNode)nodeList.get(start);
	                if(tempNode!=null){
	                	tempList.add(tempNode.val);
	                }
	                if(tempNode.left!=null){
	                	nodeList.add(tempNode.left);
	                };
	                if(tempNode.right!=null){
	                	nodeList.add(tempNode.right);
	                }
	                start++;
	            } 
	            nodeData.add(0,tempList);
	        }
	        
	        return nodeData;
	}
}
