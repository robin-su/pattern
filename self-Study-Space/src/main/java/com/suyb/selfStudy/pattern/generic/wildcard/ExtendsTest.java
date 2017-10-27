package com.suyb.selfStudy.pattern.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * extends ： 表示泛型的上限 <= 即子类或自身
 * 1.一般用于限制某个操作
 * 2.不能使用在添加数据上面，一般都是对数据的读取操作
 * 3.规则
 * 	 List<Fruit>  --> List<? extends Fruit> 
 * 	 List<Apple>  --> List<? extends Fruit> 
 * 	 List<? extends Apple>  --> List<? extends Fruit> 
 * 	 
 * 	 不能存放
 * 	 List<?>
 * 	 等同于List<? extends Object>
 */
public class ExtendsTest {
	
	public static void main(String[] args) {
		// extends 为上限
		Test<Fruit> t1 = new Test<Fruit>();
		Test<Apple> t2 = new Test<Apple>();
		Test<Pear> t3 = new Test<Pear>();
		
		//调用方法
		List<? extends Fruit> list1 = new ArrayList<Fruit>();
		test(list1);
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);
		List<Apple> list3 = new ArrayList<Apple>();
		test(list3);
		
		//? extends Apple
		List<? extends Apple> list4 = new ArrayList<FujiApple>();
		test(list4);
		
		//? --> 为什么错误，因为？等同于？ extends Object
		List<?> list5 = new ArrayList<Fruit>();
		List<? extends Object> list6 = new ArrayList<Fruit>(); //与上一句等同
//		test(list5);
		
		//若能直接add的，这里传的是FujiApp，会导致list.add(new Apple())出错
		List<FujiApple> app = new ArrayList<FujiApple>();
		test(app);
	}
	
	//? extends Fruit
	public static void test(List<? extends Fruit> list) {
		/*
		 * 编译出错，不能添加数据
		 *  list.add(new Apple());
			list.add(new FujiApple());
			list.add(new Pear());
			list.add(new Fruit());
		*/
		
		list.add(null);
	}
	
	//泛型类
	static class Test<T extends Fruit> {
		
	}
}
