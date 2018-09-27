package com.lhy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Generate {

/**	#118. �������
 * 	����һ���Ǹ����� numRows������������ǵ�ǰ numRows �С�
	����������У�ÿ�����������Ϸ������Ϸ������ĺ͡�

	ʾ��:

	����: 5
	���:
	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
	����˼·������������Ŵ�Ҷ�����Ϥ��Ҳ�Ͳ���˵�ˣ�������Ҫ��һЩϸ�ڷ�������⣬
	���Կ�����ÿһ�е���Ԫ�غ�βԪ�ؾ�Ϊ1��������������һ��û�ж�Ӧ�����Ϸ������Ϸ�Ԫ�أ�
	������Ӧ�õ������������м��Ԫ�أ���ֻ��Ҫ����������Ϸ���Ԫ�غ����Ϸ���Ԫ��֮�ͼ��ɡ�
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
