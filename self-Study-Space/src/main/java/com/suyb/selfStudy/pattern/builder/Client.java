package com.suyb.selfStudy.pattern.builder;

public class Client {
	
	public static void main(String[] args) {
		
		AirShipDirector director = new SxtAirshipDirector(new SxtAirShipBuilder());
		AirShip airShip = director.directAirShip();
		
		System.out.println(airShip.getEngine().getName());
		airShip.lunch();
		
	}

}
