package com.lhy.leetcode;

public class Reverse {

	/*	#7. 反转整数
		给定一个 32 位有符号整数，将整数中的数字进行反转。
	
		示例 1:
	
		输入: 123
		输出: 321
		 示例 2:
	
		输入: -123
		输出: -321
		示例 3:
	
		输入: 120
		输出: 21
		注意:
	
		假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。*/

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}

	public static int reverse(int x) {
		int absx = 0;
		//如果是int最小值，取不到绝对值，直接返回0
		if (x == Integer.MIN_VALUE) {
			return 0;
		}
		if (x < 0) {
			absx = Math.abs(x);//取绝对值
		} else {
			absx = x;
		}
		//先转换成String再转换成char数组
		char[] b = String.valueOf(absx).toCharArray();
		for (int i = 0, z = b.length - 1; i <= z; i++, z--) {
			char o = b[i];
			b[i] = b[z];
			b[z] = o;
		}
		//有可能超过int范围，所用long接受
		long a1 = Long.valueOf(String.valueOf(b));
		if (x < 0) {
			a1 = -1 * a1;
		}
		if (a1 > Integer.MAX_VALUE || a1 < Integer.MIN_VALUE) {
			return 0;
		}
		return new Long(a1).intValue();
	}

}
