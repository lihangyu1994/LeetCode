package com.lhy.leetcode;

public class LengthOfLastWord {
	

/*	#58. 最后一个单词的长度
 *  给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

	如果不存在最后一个单词，请返回 0 。

	说明：一个单词是指由字母组成，但不包含任何空格的字符串。

	
	示例:

	输入: "Hello World"
	输出: 5
	"a "  1
	*/
	public static void main(String[] args) {
		String word = "Hello World";
		System.out.println(lengthOfLastWord(word));
	}
	
	public static int lengthOfLastWord(String word) {
		char[] words = word.toCharArray();
		int num=0;
		for(int i=words.length-1;i>=0;i--) {
			if(words[i]!=' '){
				num++;
			}
			if(words[i]==' '&&num!=0) {
				return num;
			}
			if(words[i]==' ') {
				continue;
			}
		}
		return num;
	}

}
