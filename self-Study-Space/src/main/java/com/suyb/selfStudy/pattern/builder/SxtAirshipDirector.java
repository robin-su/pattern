package com.suyb.selfStudy.pattern.builder;

import com.suyb.selfStudy.pattern.builder.entity.Engine;
import com.suyb.selfStudy.pattern.builder.entity.EscapeTower;
import com.suyb.selfStudy.pattern.builder.entity.OrbitalModule;

public class SxtAirshipDirector implements AirShipDirector {
	
	//装配者要调用构建着
	private AirShipBuilder builder;
	
	public SxtAirshipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		Engine engine = builder.buildEngine();
		OrbitalModule orbitalModule = builder.buildOrbitalModule();
		EscapeTower escapeTower = builder.buildEscapeTower();
		
		//装配成飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(engine);
		ship.setOrbitalModule(orbitalModule);
		ship.setEscapeTower(escapeTower);
		
		return ship;
	}

}
