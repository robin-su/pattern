package com.suyb.selfStudy.pattern.factory.factoryMethod;


import com.suyb.selfStudy.pattern.factory.factoryMethod.Car;

public class Byd implements Car {
	@Override
	public void run() {
		System.out.println("比亚迪在跑！");
	}
}
