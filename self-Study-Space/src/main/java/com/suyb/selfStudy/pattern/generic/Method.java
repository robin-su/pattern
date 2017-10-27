package com.suyb.selfStudy.pattern.generic;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * 非泛型类中，定义泛型方法
 * 定义：在返回类型前面加入<T>
 */
public class Method {
	
	/**
	 * 泛型方法
	 */
	public static <T> void test(T t) {
		System.out.println(t);
	}
	
	//则T只能表示List或者List的子类
	public static <T extends List> void test(T t) {
		System.out.println(t);
		t.add("aaa");
	}
	
	/**
	 * 只能Closeable的实现类
	 * 释放资源使用
	 * ... 其实等价于[]
	 */
	public static <T extends Closeable> void test(T...a){
		for(T temp:a) {
			try {
				if(null != null) {
					temp.close(); //Closeable有close方法
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		test("bjsxt is very good");
		test(new FileInputStream("a.txt"));
	}

}
