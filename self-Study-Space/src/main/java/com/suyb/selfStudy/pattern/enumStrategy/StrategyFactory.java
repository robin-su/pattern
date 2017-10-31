package com.suyb.selfStudy.pattern.enumStrategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
	
	private static StrategyFactory factory = new StrategyFactory();

	public StrategyFactory() {
	}
	
	private static Map strategyMap = new HashMap<Integer,Strategy>();
	
	//加载的时候就把东西放进去
	static {
		strategyMap.put(RechargeTypeEnum.ALIPAY.getValue(), new Alipay());
		strategyMap.put(RechargeTypeEnum.WECHART.getValue(), new WechatPay());
		strategyMap.put(RechargeTypeEnum.BESTPAY.getValue(), new BestPay());
		strategyMap.put(RechargeTypeEnum.JD.getValue(), new JD());
	}

	public static Map getStrategyMap() {
		return strategyMap;
	}

	public Strategy creator(Integer type) {
		return (Strategy)strategyMap.get(type);
	}
	
	public static StrategyFactory getInstance() {
		return factory;
	}

}
