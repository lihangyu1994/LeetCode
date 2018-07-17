package com.lhy.leetcode;

public class LongestCommonPrefix {

	/*	#14. 最长公共前缀
		编写一个函数来查找字符串数组中的最长公共前缀。
	
		如果不存在公共前缀，返回空字符串 ""。
	
		示例 1:
	
		输入: ["flower","flow","flight"]
		输出: "fl"
		示例 2:
	
		输入: ["dog","racecar","car"]
		输出: ""
		解释: 输入不存在公共前缀。
		说明:
	
		所有输入只包含小写字母 a-z*/

	public static void main(String[] args) {
		String[] a = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(a));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0 || "".equals(strs[0])) {
			return "";
		}
		char[] firstArray = strs[0].toCharArray();
		int a = 0;
		for (int i = 0; i < firstArray.length; i++) {
			boolean flag = false;
			for (int x = 1; x < strs.length; x++) {
				if (i > strs[x].length() - 1 || strs[x].charAt(i) != firstArray[i]) {
					a = i - 1;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
			if (i == firstArray.length - 1) {
				a = i;
			}
		}
		if (a == -1) {
			return "";
		} else {
			return strs[0].substring(0, a + 1);
		}

	}

}
