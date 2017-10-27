package com.suyb.selfStudy.pattern.prototype;

/**
 * 测试普通new方式创建对象和clone方式创建对象的效率差异
 * 如果需要短时间创建大量，并且new的过程比较耗时。则可以考虑使用原型模式
 *
 */
public class Client4 {
	
	public static void testNew(int size) {
		long start = System.currentTimeMillis();
		
		for(int i = 0;i < size; i++) {
			Laptop t = new Laptop();
		}
		long end = System.currentTimeMillis(); 
		System.out.println("new的方式创建耗时：" + (end - start));
	}
	
	public static void testClone(int size) throws CloneNotSupportedException {
		Laptop t = new Laptop();
		long start = System.currentTimeMillis();
		for(int i = 0;i < size; i++) {
			Laptop temp = (Laptop)t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone的方式创建耗时：" + (end - start));
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(1000); //10381
		testClone(1000);//1
	}

}

class Laptop implements Cloneable{ //笔记本电脑
	
	public Laptop() {
		try {
			Thread.sleep(10); //模拟创建Laptop对象很耗时
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}