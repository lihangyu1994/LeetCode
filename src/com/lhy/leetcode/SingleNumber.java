package com.lhy.leetcode;

public class SingleNumber {

	/*#136. 只出现一次的数字
	给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

	说明：

	你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

	示例 1:

	输入: [2,2,1]
	输出: 1
	示例 2:

	输入: [4,1,2,1,2]
	输出: 4*/
	public static void main(String[] args) {
		int [] a = {4,1,2,1,2};
		System.out.println(singleNumber(a));
	}
	
	public static int singleNumber(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			for (int y = 0; y < nums.length; y++) {
				if (i!=y&&nums[i] == nums[y]) {
					flag = true;
					break;
				}
			}			
			if(flag==true){
				flag=false;
			}else{
				return nums[i];
			}
		}
		return -1;
	}

}
