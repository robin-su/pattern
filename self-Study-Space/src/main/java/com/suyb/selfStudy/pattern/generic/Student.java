package com.suyb.selfStudy.pattern.generic;

/**
 * po类
 */
public class Student {
	
	//表示成绩，可能是整数，小数，也有可能是字符串（"及格，不及格，优，良"）
	private Object javase;

	public Student() {
		super();
	}

	public Student(Object javase) {
		this.javase = javase;
	}

	public Object getJavase() {
		return javase;
	}

	public void setJavase(Object javase) {
		this.javase = javase;
	}
	
	/**
	 * 没有泛型的类存储数据 --> 麻烦
	 */
	public static void main(String[] args) {
		//存入整数int --> Integer --> Object  装箱
		Student stu = new Student(80);
		
		Object javase = stu.getJavase();
		
		//类型检查 处理转换异常
		if(javase instanceof Integer) {
			//强制类型转换
			Integer javaseScore = (Integer)javase;
		}
		
		stu = new Student("优秀");
		javase = stu.getJavase();
		
		//类型检查 处理转换异常
		if(javase instanceof String) {
			//强制类型转换
			String javaseScore = (String)javase;
		}
	}
}
