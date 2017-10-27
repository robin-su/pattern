package com.suyb.selfStudy.pattern.factory.factoryMethod;

public class AudiFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Audi();
	}
}
