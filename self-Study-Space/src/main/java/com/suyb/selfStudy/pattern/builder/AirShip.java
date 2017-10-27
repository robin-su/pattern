package com.suyb.selfStudy.pattern.builder;

import com.suyb.selfStudy.pattern.builder.entity.Engine;
import com.suyb.selfStudy.pattern.builder.entity.EscapeTower;
import com.suyb.selfStudy.pattern.builder.entity.OrbitalModule;

public class AirShip {

	private OrbitalModule orbitalModule; // 轨道舱
	private Engine engine;// 发动机
	private EscapeTower escapeTower;// 逃逸塔

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	
	public void lunch() {
		System.out.println("发射");
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}

}
