package com.suyb.selfStudy.pattern.enumStrategy;

public class TestControl {

	public String doPay(Double charge,int type) {
		Context context = new Context();
		Double calRecharge = context.calRecharge(charge, type);
		return calRecharge + "";
	}
	
	public static void main(String[] args) {
		TestControl testControl = new TestControl();
		String doPay = testControl.doPay(100.0,2);
		System.out.println(doPay);
	}
	
}
