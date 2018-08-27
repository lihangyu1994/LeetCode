package com.lhy.leetcode;

import java.util.Arrays;

public class Merge {

	
/*	
 * #88. 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

	说明:

	初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
	你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
	示例:

	输入:
	nums1 = [1,2,3,0,0,0], m = 3
	nums2 = [2,5,6],       n = 3

	输出: [1,2,2,3,5,6]*/
	public static void main(String[] args) {
		int []nums1 = {1,2,3,0,0,0};
		int []nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		System.out.print(Arrays.toString(merge(nums1,m,nums2,n)));
	}
	
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    	
        // 特别注意这里的m只是nums1中元素的个数，不是最终第一个数组的长度 不要用m=nums1.length;不然会造成数据越界的报错
    	 
        int i = m - 1, j = n - 1, index = m + n - 1;
 
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                // A大就把A的数组放在更后面
                nums1[index--] = nums1[i--];
 
            } else {
                nums1[index--] = nums2[j--];
 
            }
        }
        while (i >= 0) {
            // A大就把A的数组放在更后面
            nums1[index--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
        return nums1;
    }

}
