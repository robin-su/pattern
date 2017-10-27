package com.suyb.selfStudy.pattern.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *	1.泛型：标签，泛化类型
 *	2.作用：省心，安全
 */
public class Simple {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//安全，
//		list.add(1);//类型检查
		list.add("so easy!");
		//省心
		String ele = list.get(0);
		System.out.println(ele);
		
		//jdk1.4以前
		List list2 = new ArrayList();
		list2.add(1);
		list2.add("old");
		
		Object obj = list2.get(0);
		//麻烦
		Integer num = (Integer)obj;
		//不安全
//		num = (Integer)list2.get(1);
		if(list2.get(1) instanceof Integer) { //手动类型转换
			num = (Integer)list2.get(1);//安全
		}
	}
}
