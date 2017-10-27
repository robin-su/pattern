package com.suyb.selfStudy.pattern.factory.factoryMethod;

public class BenzFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Benz();
	}
}
