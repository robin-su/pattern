package com.suyb.selfStudy.pattern.adapter;

/**
 * 客户端
 * （相当于例子中的笔记本，只有USB接口）
 */
public class Client {
	
	public void test1(Target t) { //Target 相当于USB接口
		t.handleReq();
	}
	
	public static void main(String[] args) {
		
		Client c = new Client();
		
//		Target t = new Adpater();
		Target t = new Adapter2(new Adaptee());
		
		c.test1(t);
		
	}
	
}
