package com.suyb.selfStudy.pattern.builder;

import com.suyb.selfStudy.pattern.builder.entity.Engine;
import com.suyb.selfStudy.pattern.builder.entity.EscapeTower;
import com.suyb.selfStudy.pattern.builder.entity.OrbitalModule;

/**
 * 构建器
 */
public interface AirShipBuilder {

	Engine buildEngine();

	OrbitalModule buildOrbitalModule();

	EscapeTower buildEscapeTower();

}
