package com.suyb.selfStudy.pattern.generic.polymorphic;

import java.util.ArrayList;
import java.util.List;


/**
 * 1.泛型没有多态
 * 2.泛型没有数组
 */
public class Polymorphism {
	
	public static void main(String[] args) {
		//父类应用指向子类对象对泛型不成立
//		List<Fruit> list = new ArrayList<Apple>();
		List<? extends Fruit> list = new ArrayList<Apple>();
		
		//泛型没有数组
//		Fruit<String>[] arr = new Fruit<String>[10];
		
		//JDK 1.7 泛型简化
		List<Fruit> list1 = new ArrayList<>();
		
	}

}
