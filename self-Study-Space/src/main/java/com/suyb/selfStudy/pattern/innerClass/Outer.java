package com.suyb.selfStudy.pattern.innerClass;

public class Outer {
	public static void main(String[] args) {
		// 不能直接调用内部类
//		Nose nose = new Nose();
		//非静态内部类，必须现有外部类，才能有内部类
		Face f = new Face();
		Face.Nose nose = f.new Nose();
		nose.breath();
		
		//静态内部类的实例化
		Face.Ear ear = new Face.Ear();
		ear.listen();
		
	}
	
	
}

class Face {
	int type = 20;
	String shape = "瓜子脸";
	
	static String color = "红润";
		
	/**
	 * 这个类的对象是从属于外部类的对象的，static的必须从属于类。
	 * 所以非静态内部类里面不能定义静态的成员，属性和方法。只能定
	 * 义普通的属性和方法
	 */
	class Nose {
		String type;
		
		void breath() {
			System.out.println(shape);//瓜子脸
			System.out.println(Face.this.type); //20//内部类访问外部类成员的形式，若自己没有type.则可以直接调用
			System.out.println("呼吸");
		}
	}
	
	/**
	 * 静态内部类
	 */
	static class Ear {
		void listen() {
//			System.out.println(shape);静态不能调用外部非静态的，因为你调的时候不一定有，类没有初始化的时候这些属性不存在
			System.out.println("我在听！");
			System.out.println(color);
		}
	} 
}