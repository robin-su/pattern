package com.suyb.selfStudy.pattern.factory.simpleFactory;

public class CarFactory {
	
	/**
	 * 违反开闭原则，每次添加新的类都要修改代码（添加）
	 */
	public static Car createCar(String type) {
		
		if("奥迪".equals(type)) {
			return new Audi();
		}else if("比亚迪".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
		
	}
	
}
