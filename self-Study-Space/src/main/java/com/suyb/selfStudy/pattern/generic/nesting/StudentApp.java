package com.suyb.selfStudy.pattern.generic.nesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 *  泛型嵌套  --> 由外到内的拆分
 */
public class StudentApp {
	
	public static void main(String[] args) {
		Student<String> stu = new Student<String>();
		stu.setScore("优秀");
		System.out.println(stu.getScore()); //优秀
		
		//泛型的嵌套
		Bjsxt<Student<String>> bjsxt = new Bjsxt<Student<String>>();
		
		bjsxt.setStu(stu);
		stu = bjsxt.getStu();
		String score = stu.getScore();
		System.out.println(score);
		
		//HashMap   -->  使用泛型的嵌套
		Map<String, String> map = new HashMap<String,String>();
		map.put("a","java");
		map.put("b", "马士兵Javase");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
	}

}
