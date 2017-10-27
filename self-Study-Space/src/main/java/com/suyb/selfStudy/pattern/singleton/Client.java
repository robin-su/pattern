package com.suyb.selfStudy.pattern.singleton;

public class Client {
	
	public static void main(String[] args) {
		HungryManSingleton instance1 = HungryManSingleton.getInstance();
		HungryManSingleton instance2 = HungryManSingleton.getInstance();
		System.out.println(instance1 == instance2);
	}
	
}
