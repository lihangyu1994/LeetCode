package com.lhy.leetcode;

import java.util.Arrays;

public class TwoSum {

/*	#1. 两数之和
	给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

	你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

	示例:

	给定 nums = [2, 7, 11, 15], target = 9

	因为 nums[0] + nums[1] = 2 + 7 = 9
	所以返回 [0, 1]*/
	
	public static void main(String[] args) {
		 int []nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(nums,9)));
	} 
    public static int[] twoSum(int[] nums, int target) {
    	int [] a = new int[2];
    	for(int x=0;x<nums.length-1;x++) {
    		for(int y=x+1;y<nums.length;y++ ) {
    			if(nums[x]+nums[y]==target) {
    				a[0]=x;
    				a[1]=y;
    			}
    		}
    	}
    	return a;
    }
}
