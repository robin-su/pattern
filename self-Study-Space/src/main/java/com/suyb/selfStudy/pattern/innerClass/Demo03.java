package com.suyb.selfStudy.pattern.innerClass;

import java.util.Date;

public class Demo03 {
	
	public static void main(String[] args) {
		Outer03 outer03 = new Outer03();
		Outer03.InnerClass oic =  outer03.new InnerClass();
		oic.test();
		
	}

}

class Outer03 {
	
	private int a = 3;
	int b = 10;
	
	public void ttt() { //ttt() 是Outer03的一个普通方法，当我们调用ttt()的时候，必须是Outer03实例已经存在了
		InnerClass ic = new InnerClass();
	}
	
	//成员内部类（成员内部类的实例化对象的时候，必须要先有外部类对象才能有成员内部类对象，这是跟静态内部类的区别之一）
	class InnerClass{
		
		int c = 1;
//		static int d= 80;不能有静态成员，除非声明为final,并且只能是编译器可以确定值的常量表达式
		final static int d = 80;//但是声明常量是可以的！！！！！！
//		final static Date date = new Date(); 复制表达式也应该是常量new Date()不可以，可以是类似于80这样的常数
		
		/**
		 * 假设可以，那么外部去应用的时候，Outer03.InnerClass.ab即可以获取内部类对象，则成员内部类对象，
		 * 则完全脱离了外部类的控制了.违反了设计初衷
		 */
//		static InnerClass ab = new InnerClass();
		
		/*static 不能有静态方法*/ void test() {
			System.out.println(a); 
			System.out.println("内部类:" + this); //代表内部类对象本身！
			System.out.println("外部类对象："+Outer03.this); //应用了外部类的对象
		}
		
	}
	
}