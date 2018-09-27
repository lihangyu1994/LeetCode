package com.lhy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Generate {

/**	#118. 杨辉三角
 * 	给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
	在杨辉三角中，每个数是它左上方和右上方的数的和。

	示例:

	输入: 5
	输出:
	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
	解题思路：杨辉三角相信大家都很熟悉，也就不多说了，这里主要讲一些细节方面的问题，
	可以看到，每一行的首元素和尾元素均为1，并且它们在上一行没有对应的左上方或右上方元素，
	故我们应该单独处理，对于中间的元素，就只需要获得它的左上方的元素和右上方的元素之和即可。
	*/
	public static void main(String[] args) {
		System.out.println(generate(5).toString());
	}
	public static List<List<Integer>> generate(int rowNum){
		List<List<Integer>> allList  = new ArrayList<List<Integer>>();
		if(rowNum<1) {
			return allList;
		}
		List<Integer> li = new ArrayList<>();
		li.add(1);
		allList.add(li);

		for(int i=2;i<=rowNum;i++) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			List<Integer> preList = allList.get(i-2);
			for(int y=1;y<i-1;y++) {
				list.add(preList.get(y-1)+preList.get(y));
			}
			list.add(1);
			allList.add(list);
		}
		return allList;
		
	}

}
