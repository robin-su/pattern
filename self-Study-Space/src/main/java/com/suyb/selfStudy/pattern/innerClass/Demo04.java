package com.suyb.selfStudy.pattern.innerClass;

/**
 * 测试方法内部类（局部内部类）
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.test();
	}
}


class Outer04 {
	
	public void test() {
		final int i = 3;//JDK1.8这种地方的局部变量默认就是有final的,可以不写
		
		/*
		 * 1.跟局部成员一样，不能使用权限修饰符来修饰
		 * 2.方法内部类，只能在声明的方法中可见
		 * 3.方法内部类中不能定义静态成员。只能定义非静态成员
		 */
		class Inner {
			int b = 10;
//			static int c = 20;不能定义静态成员
			
			public void tt() {
				System.out.println(b);
				System.out.println(i);//方法内部类中，不能引用所在方法普通局部变量，除非是final。原因如下：
				//方法的声明周期和方法内部类对象的生命周期不一致！方法执行完，内部类对象可能仍然存在
			}
		}
		
		Inner inner = new Inner();
		inner.tt();
		
	}
	
}