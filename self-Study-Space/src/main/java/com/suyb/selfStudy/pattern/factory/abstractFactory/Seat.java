package com.suyb.selfStudy.pattern.factory.abstractFactory;

public interface Seat {
	void message();
}

class LuxurySeat implements Seat{
	@Override
	public void message() {
		System.out.println("自动按摩");
	}
}

class LowSeat implements Seat{
	@Override
	public void message() {
		System.out.println("不能按摩");
	}
}