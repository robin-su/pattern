package com.suyb.selfStudy.pattern.factory.factoryMethod;

public class BydFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Byd();
	}
}
