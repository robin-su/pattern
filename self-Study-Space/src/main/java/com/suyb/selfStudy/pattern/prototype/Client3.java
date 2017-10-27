package com.suyb.selfStudy.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式（深复制，使用序列化和反序列化的方式实现深复制）
 */
public class Client3 {
	
	public static void main(String[] args) throws Exception {
		Date date = new Date(1231231331L);
		Sheep s1 = new Sheep("少利",date);
		
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());
		
//		Sheep s2 = (Sheep) s1.clone();
		//使用序列化和反序列化实现深克隆，虽然sheep只是实现了浅克隆
		ByteArrayOutputStream bos = new ByteArrayOutputStream();//将对象字节化给一个字节数组
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);//将字节数组中的数据转换成输入流
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep)ois.readObject(); //使用反序列化深克隆
		
		date.setTime(23432412342L);
		
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
	}

}
