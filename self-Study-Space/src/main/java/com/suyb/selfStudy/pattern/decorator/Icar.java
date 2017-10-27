package com.suyb.selfStudy.pattern.decorator;

/**
 * 抽象组件
 */
public interface Icar {
	void move();
}

/**
 * 被装饰者。真实对象
 */
class Car implements Icar {
	@Override
	public void move() {
		System.out.println("陆地上跑！");
	}
}

/**
 * Decorator装饰器角色
 */
class SuperCar implements Icar {
	
	protected Icar car;
	
	public SuperCar(Icar car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}
}

/**
 * 具体装饰对象
 */
class FlyCar extends SuperCar{

	public FlyCar(Icar car) {
		super(car);
	}
	
	public void fly() {
		System.out.println("天上飞！");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
}

/**
 * 具体装饰对象
 */
class WaterCar extends SuperCar{

	public WaterCar(Icar car) {
		super(car);
	}

	public void swim() {
		System.out.println("水上游！");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}


/**
 * 具体装饰对象
 */
class AICar extends SuperCar{
	
	public AICar(Icar car) {
		super(car);
	}

	public void autoMove() {
		System.out.println("自动跑！");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
}

