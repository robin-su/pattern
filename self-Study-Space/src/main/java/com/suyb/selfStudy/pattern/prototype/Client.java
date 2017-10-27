package com.suyb.selfStudy.pattern.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 */
public class Client {	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date birthday = new Date(123123123123L);
		Sheep s1 = new Sheep("少利",birthday);
		System.out.println(s1);//com.suyb.selfStudy.pattern.prototype.Sheep@15db9742
		
		birthday.setTime(1011123565622L);  //这个动作会导致s1和s2的birthday都变掉
		
		System.out.println("s1的名字是: " + s1.getName()+ "," 
						+ "s1的生日是: " + s1.getBirthday());//s1的名字是: 少利s1的名字是: Mon Nov 26 08:52:03 CST 1973
		
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2);//com.suyb.selfStudy.pattern.prototype.Sheep@6d06d69c
		System.out.println("s2的名字是: " + s2.getName() + "," 
						+ "s2的生日是: " + s2.getBirthday());//s2的名字是: 少利s2的名字是: Mon Nov 26 08:52:03 CST 1973
		
		System.out.println("------------------------ 修改克隆的对象的属性 -------------------------");
		
		s2.setName("多利");
		System.out.println("s2的名字是: " + s2.getName() + "," 
						+ "s2的生日是: " +  s2.getBirthday());
	}

}
