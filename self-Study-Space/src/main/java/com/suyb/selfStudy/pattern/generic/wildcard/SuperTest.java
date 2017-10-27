package com.suyb.selfStudy.pattern.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * super ： 表示泛型的下限  >= 即父类或自身
 * 1.一般用于下限操作
 * 2.能够添加数据，不能添加父对象
 * 3.规则
 * 	 List<Fruit>  --> List<? super Apple> 
 * 	 List<Apple>  --> List<? super Apple> 
 * 	 List<? super Fruit>  --> List<? super Apple> 
 * 	 
 * 	 不能存放
 *   List<? super FujiApple>  --> List<? super Apple> 
 * 
 */

public class SuperTest {
	
	public static void main(String[] args) {
		
		List<Apple>  list1 = new ArrayList<Apple>();
		test(list1);
		
		List<Fruit>  list2 = new ArrayList<Fruit>();
		test(list2);
		
		List<Object> list3 = new ArrayList<Object>();
		test(list3);
		
		//规则
		List<? super Apple> list4 = new ArrayList<Apple>();
		test(list3);
		
		List<? super Fruit> list5 = new ArrayList<Fruit>();
		test(list5);
		
		List<? super FujiApple> list6 = new ArrayList<Apple>();
//		test(list6);  编译出错
		
		//? 等同于 ？ extends Object
		List<?> list7 = new ArrayList<Object>();
//		test(list7);  编译出错
	}
	
	public static void test(List<? super Apple> list) {
		// 不能添加父类信息
		list.add(new Apple());
		list.add(new FujiApple());
//		list.add(new Fruit());
	}
	
}
