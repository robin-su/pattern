package com.suyb.selfStudy.pattern.decorator;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("增加新的功能：飞行----------");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("新增新的功能：水上游----------");
		WaterCar waterCar= new WaterCar(car);
		waterCar.move();
		
		System.out.println("新增新的功能：水上飞和水里游----------");
		WaterCar flywaterCar= new WaterCar(new FlyCar(car));
		flywaterCar.move();
	}

}
