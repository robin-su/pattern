package com.suyb.selfStudy.pattern.innerClass;

public class Demo01 {
	
	//静态内部类（一般情况，内部类仅仅供外部类使用，所以一般定义成private,很少暴露给外部类）
	private static class StaticNestedClass {
	}
	
	//普通内部类（成员内部类）
	private class FieldInnerClass {
	}
	
	//匿名内部类 
	Runnable runnable = new Runnable() {//两个作用：定义了匿名内部类的类体；创建了匿名内部类的一个实例
		
		@Override
		public void run() {
			
		}
	};
	
	void sayHello() {
		
		//方法内部类（局部内部类）
		class LocalClass {
			
		}
		
		//匿名内部类 （本例比较特殊，既是匿名内部类，又是方法内部类）
		Runnable runnable = new Runnable() {//两个作用：定义了匿名内部类的类体；创建了匿名内部类的一个实例
			
			@Override
			public void run() {
				
			}
		};
	}
}
