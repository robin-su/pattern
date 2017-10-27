package com.suyb.selfStudy.pattern.generic;

/**
 * 自定义泛型类
 * 1.<> --> 单个大字母，见名知意
 * 2. T		Type
 * 	  K V   Key Value
 * 	  E		Element
 * 
 * 3.注意点:
 * 	泛型不能使用在静态属性上
 * 	指定的类型不能是基本类型
 * 
 */
//T --> type简称，表示类型
public class MyStudent<T> {
	
	private T javase;
	
//	private static T test;泛型不能使用在静态属性上
	
	public MyStudent() {
	}
	
	public MyStudent(T javase) {
		this.javase = javase;
	}
	
	public T getJavase() {
		return javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
	
	/**
	 * 自定义泛型类的使用，
	 * 在声明的同时指定具体的类型，
	 * 不能为基本类型
	 */
	public static void main(String[] args) {
//		MyStudent<int> stu = new MyStudent<int>();
		MyStudent<Integer> stu = new MyStudent<Integer>();
		//1.安全：类型检查
		//stu.setJavase("优秀");自动类型检查
		stu.setJavase(80);
		//2.省心：自动类型转换，免去了类型检查
		Integer score = stu.getJavase();
		System.out.println(score);//80
		
	}

}
