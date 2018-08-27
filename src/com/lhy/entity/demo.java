package com.lhy.entity;

import java.io.File;
import java.util.LinkedList;

class demo {
	static public void main(String[] args) {
		/*File file = new File("D:\\\\360");
		getAllFile(file);*/
		Integer s =new Integer(3);
		Integer s1 =new Integer(3);
		System.err.println(s.equals(s1));
		
		demo2 i = new demo2();
		demo2 iii =i;
		demo2 ii = new demo2();
		System.out.println(i.equals(iii));
		
	}
	public static void getAllFile(File file){
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				getAllFile(files[i]);
			} 
			System.out.println(files[i]);
		}
	}

}

class demo2 {
	public void demo2(String a){
		
	}
}
