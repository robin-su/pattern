package com.suyb.selfStudy.pattern.prototype;

import java.util.Date;

/**
 * 测试深克隆
 */
public class Client2 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Date birthday = new Date(123123123123L);
		Sheep2 s1 = new Sheep2("少利",birthday);
		Sheep2 s2 = (Sheep2) s1.clone();
		System.out.println(s1);
		
		System.out.println("s1的名字是: " + s1.getName()+ "," 
				+ "s1的生日是: " + s1.getBirthday());
		
		birthday.setTime(101112355556622L);  //这个动作不会影响s2
		
		System.out.println("s1的名字是: " + s1.getName()+ "," 
						+ "s1的生日是: " + s1.getBirthday());
		
		System.out.println(s2);
		System.out.println("s2的名字是: " + s2.getName() + "," 
						+ "s2的生日是: " + s2.getBirthday());
	
	}

}
