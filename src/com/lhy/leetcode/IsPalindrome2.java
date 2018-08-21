package com.lhy.leetcode;

public class IsPalindrome2 {

	/*
	 * #125. 验证回文串 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
	 * 
	 * 说明：本题中，我们将空字符串定义为有效的回文串。
	 * 
	 * 示例 1:
	 * 
	 * 输入: "A man, a plan, a canal: Panama" 输出: true 示例 2:
	 * 
	 * 输入: "race a car" 输出: false
	 */
	public static void main(String[] args) {
		String s="1P";
		System.out.println(IsPalindrome2(s));
	}
	
    public static boolean IsPalindrome2(String s) {
    	if("".equals(s)){
    		return true;
    	}
    	char [] demo = s.toCharArray();
    	StringBuilder str = new StringBuilder();
    	for(int i=0;i<demo.length;i++){
    		if(demo[i]>=97 && demo[i]<=122){
    			str.append(demo[i]);
    		}else if(demo[i]>=65 && demo[i]<=90){
    			str.append((char) (demo[i]+32));
    		}else if(demo[i]>='0'&&demo[i]<='9'){
    			str.append(demo[i]);
    		}
    	}
    	char [] newDemo = str.toString().toCharArray();
    	for(int x=0,y=newDemo.length-1;x<=y;x++,y--){
    		if(newDemo[x]!=newDemo[y]){
    			return false;
    		}
    	}
		return true;
    }

}
