package com.lhy.leetcode;

public class MaxProfit {

	/**
	 * 121. ������Ʊ�����ʱ�� ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
	 * 
	 * ��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
	 * 
	 * ע���㲻���������Ʊǰ������Ʊ��
	 * 
	 * ʾ�� 1:
	 * 
	 * ����: [7,1,5,3,6,4] ���: 5 ����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� =
	 * 6����ʱ��������������� = 6-1 = 5 �� ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸� ʾ�� 2:
	 * 
	 * ����: [7,6,4,3,1] ���: 0 ����: �����������, û�н������, �����������Ϊ 0��
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] price = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(price));
	}

	public static int maxProfit(int[] price) {
		if (price == null || price.length == 0) {
			return 0;
		}
		int value = 0;
		for (int x = 0; x < price.length - 1; x++) {
			for (int y = x + 1; y < price.length; y++) {
				if (price[y] - price[x] > value) {
					value = price[y] - price[x];
				}
			}
		}
		return value;
	}

}
