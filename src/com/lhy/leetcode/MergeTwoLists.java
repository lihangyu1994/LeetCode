package com.lhy.leetcode;

import com.lhy.entity.ListNode;

public class MergeTwoLists {

	/*#21. 合并两个有序链表
	将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
	
	示例：
	
	输入：1->2->4, 1->3->4
	输出：1->1->2->3->4->4
	*/
	public static void main(String[] args) {
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode l0 = l1.val > l2.val ? l2 : l1;
		//分治思想，每次拿一个小的出来，每次的动作相同
		l0.next = l1.val > l2.val ? mergeTwoLists(l1, l2.next) : mergeTwoLists(l1.next, l2);
		return l0;
	}
}
