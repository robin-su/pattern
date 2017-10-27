package com.suyb.selfStudy.pattern.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class ChessFlyWeightFactory {
	
	//享元池,key代表颜色，value代表棋子
	private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color) {
		if(map.get(color) != null) {
			return map.get(color);
		}else {
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}

}
