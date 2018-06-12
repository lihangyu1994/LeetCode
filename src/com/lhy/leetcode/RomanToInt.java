package com.lhy.leetcode;

public class RomanToInt {

	/*	#13. 罗马数字转整数
		罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。
	
		字符          数值
		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000
		例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
	
		通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
	
		I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
		X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
		C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
		给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。*/

	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));
	}

	public static int romanToInt(String s) {
		char[] a = s.toCharArray();
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if ('I' == a[i] && i != a.length - 1) {
				if (a[i + 1] == 'V') {
					result = result + 4;
					i++;
					continue;
				}
				if (a[i + 1] == 'X') {
					result = result + 9;
					i++;
					continue;
				}
			}
			if ('X' == a[i] && i != a.length - 1) {
				if (a[i + 1] == 'L') {
					result = result + 40;
					i++;
					continue;
				}
				if (a[i + 1] == 'C') {
					result = result + 90;
					i++;
					continue;
				}
			}
			if ('C' == a[i] && i != a.length - 1) {
				if (a[i + 1] == 'D') {
					result = result + 400;
					i++;
					continue;
				}
				if (a[i + 1] == 'M') {
					result = result + 900;
					i++;
					continue;
				}
			}
			if ('I' == a[i]) {
				result = result + 1;
			} else if ('V' == a[i]) {
				result = result + 5;
			} else if ('X' == a[i]) {
				result = result + 10;
			} else if ('L' == a[i]) {
				result = result + 50;
			} else if ('C' == a[i]) {
				result = result + 100;
			} else if ('D' == a[i]) {
				result = result + 500;
			} else if ('M' == a[i]) {
				result = result + 1000;
			}
		}
		return result;
	}
}
