package com.lhy.leetcode;

public class AddBinary {

	/*#67. 二进制求和
	给定两个二进制字符串，返回他们的和（用二进制表示）。
	
	输入为非空字符串且只包含数字 1 和 0。
	
	示例 1:
	
	输入: a = "11", b = "1"
	输出: "100"
	示例 2:
	
	输入: a = "1010", b = "1011"
	输出: "10101"*/
	
	public static void main(String[] args) {
		String a = "1010", b = "1011";
		System.out.println(addBinary(a,b));
	}
	
    public static String addBinary(String a, String b) {
    	String result = "";
    	int aLen = a.length()-1;
    	int bLen = b.length()-1;
    	int temp = 0;
    	while(aLen>=0||bLen>=0) {
    		if(aLen>=0) {
    			temp = temp+Integer.valueOf(a.substring(aLen,aLen+1));
    			aLen--;
    		}
    		if(bLen>=0) {
    			temp = temp+Integer.valueOf(b.substring(bLen,bLen+1));
    			bLen--;
    		}
    		if(temp==0||temp==1) {
    			result = temp+""+result;
    			temp=0;
    		}else if(temp==2) {
    			result = "0"+result;
    			temp=1;
    		}else if(temp==3) {
    			result = "1"+result;
    			temp=1;
    		}
    	}
    	if(temp==1) {
    		result="1"+result;
    	}
    	return result;
    }
}
