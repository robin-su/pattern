package com.suyb.selfStudy.pattern.innerClass;

public class Demo05 {
	public static void main(String[] args) {
		Outer05 out = new Outer05();
		out.test(); //子类的车跑！
		
	}
}

class Outer05 {
	
	public void test02(Car c) {
		c.run();
	}
	
	public void test() {
		
		//匿名内部类.由于本内部类定义在方法中，也是方法内部类，放到外面就是成员内部类
		//Runnable是一个接口，实际上new出来的是，Runnable接口实现类的对象
		//匿名内部类的（接口式）
		Runnable runnable = new Runnable(){ 
			@Override
			public void run() {
			}
		};
		
		//（继承式）的匿名内部类
		Car car = new Car() {
			@Override
			public void run() {
				System.out.println("子类的车跑！");
			}
			
		};
		car.run();
		
		//参数式
		test02(new Car(){

			@Override
			public void run() {
				System.out.println("参数式匿名内部类，车在跑！");
			}
			
		});
	}
}

class Car {
	public void run() {
		System.out.println("汽车跑！");
	}
}