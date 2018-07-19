package com.lhy.leetcode;

public class ClimbStairs {

	/*	70. 爬楼梯
		假设你正在爬楼梯。需要 n 步你才能到达楼顶。
	
		每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
	
		注意：给定 n 是一个正整数。
	
		示例 1：
	
		输入： 2
		输出： 2
		解释： 有两种方法可以爬到楼顶。
		1.  1 步 + 1 步
		2.  2 步
		示例 2：
	
		输入： 3
		输出： 3
		解释： 有三种方法可以爬到楼顶。
		1.  1 步 + 1 步 + 1 步
		2.  1 步 + 2 步
		3.  2 步 + 1 步*/
	
	public static void main(String[] args) {
		System.out.println(ClimbStairs(5));
	}

	/*	解法一：用组合数的思想求解，分下面的情况，没有一次走两个台阶的有C(0, n)，只一次走两个台阶C(1, n-1)，只二次走两个台阶，C(2, n-2)，直到只有[n/2]（向下取整）次走两个台阶。其和就是所有的解法。
		解法二：使用分治法，对n个台阶，用一个数组保存其解，a[1] = 1，a[2] = 2, k >= 2，有a[k] = a[k-1]+a[k-2]. */
	public static int ClimbStairs(int n) {
	    int result = 0;

        if(n<=2) {
        	result=n;
        } else if (n > 2) {
            // 保存所有的解法
            int[] ways = new int[n];

            ways[0] = 1;
            ways[1] = 2;

            for (int i = 2; i < ways.length; i++) {
                ways[i] = ways[i - 1] + ways[i - 2];
            }

            result = ways[ways.length - 1];
        }

        return result;
    }

}
