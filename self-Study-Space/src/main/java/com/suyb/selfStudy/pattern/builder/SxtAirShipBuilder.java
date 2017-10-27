package com.suyb.selfStudy.pattern.builder;

import com.suyb.selfStudy.pattern.builder.entity.Engine;
import com.suyb.selfStudy.pattern.builder.entity.EscapeTower;
import com.suyb.selfStudy.pattern.builder.entity.OrbitalModule;

/**
 * 构建器实现类
 */
public class SxtAirShipBuilder implements AirShipBuilder { //以builder结尾的基本上都是建造者模式

	@Override
	public Engine buildEngine() {
		System.out.println("构建尚学堂牌发动机");
		return new Engine("尚学堂牌发动机");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("构建轨道舱！");
		return new OrbitalModule("尚学堂牌轨道舱");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("构建逃逸塔！");
		return new EscapeTower("尚学堂牌逃逸塔!");
	}

}
