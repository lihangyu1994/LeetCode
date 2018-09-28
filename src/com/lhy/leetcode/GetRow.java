package com.lhy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GetRow {

	/*
	 * #119. ������� II ����һ���Ǹ����� k������ k �� 33������������ǵĵ� k �С�
	 * 
	 * ����������У�ÿ�����������Ϸ������Ϸ������ĺ͡�
	 * 
	 * ʾ��:
	 * 
	 * ����: 3 ���: [1,3,3,1]
	 */

	public static void main(String[] args) {
			System.out.println(getRow(5).toString());
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		long nk = 1;
		for (int i = 0; i <= rowIndex; i++) {
			res.add((int) nk);
			nk = nk * (rowIndex - i) / (i + 1);
		}
		return res;
	}

}
