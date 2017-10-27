package com.suyb.selfStudy.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 *  测试反射和反序列化破解单例模式
 */
public class CrackClient {
	
	public static final String PATH = "C:\\Users\\robin\\Desktop\\a.txt";
	
	public static void main(String[] args) throws Exception {
		CrackLazySingleton s1 = CrackLazySingleton.getInstance();
		CrackLazySingleton s2 = CrackLazySingleton.getInstance();
		
		System.out.println(s1 == s2);//true
		
		/**
		 * 通过仿射来创建多个对象，破解单例模式
		 
		Class<CrackLazySingleton> clazz = (Class<CrackLazySingleton>)Class.forName("com.suyb.selfStudy.pattern.singleton.CrackLazySingleton");
		Constructor<CrackLazySingleton> c = clazz.getDeclaredConstructor(null);//获取无参构造器
		c.setAccessible(true);
		CrackLazySingleton s3 = c.newInstance();
		CrackLazySingleton s4 = c.newInstance();
		System.out.println(s3 == s4); //false,发现我们跳过的单例
		*/
		
		/**
		 * 通过反序列化的方式，来构造多个对象
		 * 思路：通过序列化的方式，把s1存到硬盘上，再通过反序列化的方式把他读出来
		 */
		/** 序列化 **/
		
		
		FileOutputStream fos = new FileOutputStream(PATH); // 写出地址
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);  //把对象写出去
		oos.close();
		fos.close();
		
		/** 反序列化 **/
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
		CrackLazySingleton s4 = (CrackLazySingleton)ois.readObject();
		System.out.println(s1 == s4); // true
		
	}

}
