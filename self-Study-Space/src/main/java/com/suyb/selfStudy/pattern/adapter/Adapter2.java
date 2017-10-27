package com.suyb.selfStudy.pattern.adapter;

/**
 * 适配器（使用组合，组合被适配对象）
 */
public class Adapter2 implements Target {
	
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
	@Override
	public void handleReq() {
		adaptee.request();
	}

}
