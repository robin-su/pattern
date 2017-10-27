package com.suyb.selfStudy.pattern.factory.abstractFactory;

public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}

