package com.suyb.selfStudy.pattern.generic.extend;

public class MyStudent<T> {
	
	private T javase;

	public MyStudent() {
		super();
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
	 * 泛型的擦除：使用时 |实现|继承 没有指定类型
	 * 类似于Object,不等同于Object
	 */
	public static void main(String[] args) {
		//泛型擦除 --> 没有指定泛型的具体类型
		MyStudent student = new MyStudent();
		student.setJavase(100); //100 --> int --> Integer --> Object
		Object obj = student.getJavase();
		
		test(student);//编译不会类型检查
		
		MyStudent<Object> student2 = new MyStudent<Object>();
		//不等于Object
//		test(student2);编译错误
	}
	
	public static void test(MyStudent<Integer> stu){
		
	}

}
