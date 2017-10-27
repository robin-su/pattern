package com.suyb.selfStudy.pattern.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * ? --> 通配符，类型不确定，用于声明变量|形参上
 * 不能用在：
 * 	1.创建对象
 * 	2.创建泛型类，泛型方法，泛型接口上
 * 
 */
public class WildcardTest {
	
	public static void main(String[] args) {
		//声明，注意用？可以通配各种引用类型，看例子就知道了
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();  
		
		test(list);
		
		//编译错误  通配符不能用来创建对象
//		list = new ArrayList<?>();
	}
	
	public static void test(List<?> list) {
		
	}
	
	/*
	 * 不能用在泛型方法上
	public static  <?> void test2(List<?> list) {
		
	}
	*/
	//不能用在创建泛型类
	class Test<T>{}
	
	//编译错误
	/*class Test<?>{}*/

}
