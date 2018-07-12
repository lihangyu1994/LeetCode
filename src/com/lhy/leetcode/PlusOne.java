package com.lhy.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
	
	/*#66. 加一
	给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

	最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

	你可以假设除了整数 0 之外，这个整数不会以零开头。

	示例 1:
	输入: [1,2,3]
	输出: [1,2,4] 525/100  5   /10  2 /1
	解释: 输入数组表示数字 123。
	示例 2:

	输入: [4,3,2,1]
	输出: [4,3,2,2]
	解释: 输入数组表示数字 4321。
*/
	public static void main(String[] args) {
		int [] a= {9,9,9,9};
		System.out.println(Arrays.toString(plusOne(a)));
	}

    public static int[] plusOne(int[] digits) {
    	int num =1;
    	int length = digits.length-1;
    	while(length>=0&&num>0) {
    		int temp = digits[length]+1;
    		num = temp/10;
    		digits[length] = temp%10;
    		length--;
    	}
    	while(num>0) {
    		int [] newDigits = new int[digits.length+1];
    		for(int a=0;a<newDigits.length;a++) {
    			if(a==0) {
    				newDigits[0] = 1;
    			}else {
    				newDigits[a] = digits[a-1];
    			}
    			
    		}
    		return newDigits;
    	}
    	return digits;
    }
}
