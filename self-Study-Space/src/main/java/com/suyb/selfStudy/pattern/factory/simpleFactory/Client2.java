package com.suyb.selfStudy.pattern.factory.simpleFactory;

/**
 *  测试在没用工厂模式的情况下
 */
public class Client2 { //调用者
	
	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("奥迪");
		Car c2 = CarFactory.createCar("比亚迪");
		
		c1.run();
		c2.run();
	}

}
