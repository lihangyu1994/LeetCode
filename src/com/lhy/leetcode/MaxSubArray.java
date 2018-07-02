package com.lhy.leetcode;

public class MaxSubArray {
	/*	#53. 最大子序和
	 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
	
		示例:
	
		输入: [-2,1,-3,4,-1,2,1,-5,4],
		输出: 6
		解释: 连续子数组 [4,-1,2,1] 的和最大，为 6*/

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
    	int maxNum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
        	int max = 0;
        	for(int y=i;y<nums.length;y++) {
        		max = max+nums[y];
        		if(max>maxNum) {
        			maxNum = max;
        		}
        	}
        }    	
        return maxNum;
    }
}
