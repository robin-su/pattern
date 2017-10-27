package com.suyb.selfStudy.pattern.template;

public abstract class BankTemplateMethod {
	
	//具体方法
	public void takeNumber() {
		System.out.println("取号排队！");
	}
	
	public abstract void transact();
	
	public void evalute() {
		System.out.println("反馈评分");
	}
	
	//模板方法
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evalute();
	}
	
}
