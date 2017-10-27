package com.suyb.selfStudy.pattern.innerClass;

import com.suyb.selfStudy.pattern.innerClass.Outer02.StaticInnerClass;

public class Demo02 {
	
	public static void main(String[] args) {
		
		//不相关内部类实例化静态内部类的方法一：（推荐使用）
		Outer02.StaticInnerClass osic = new Outer02.StaticInnerClass();
		
		//不相关内部类实例化静态内部类的方法二：
//		StaticInnerClass osic1 = new StaticInnerClass();//import com.suyb.selfStudy.pattern.innerClass.Outer02.StaticInnerClass;
	}

}

class Outer02 {
	int c = 5;
	static int d = 10;
	
	void ttt() {
		StaticInnerClass sic = new StaticInnerClass();
		
	}
	
	/**
	 * 静态内部类
	 */
	static class StaticInnerClass {
		int a = 3;
		static int b = 5;
		
		public void test() {
			System.out.println(d);
//			System.out.println(c); 在静态内部类中，不能调用外部类的普通成员；只能调用静态成员！
		}
	}
	
}
