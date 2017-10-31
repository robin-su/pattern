package com.suyb.selfStudy.pattern.enumStrategy;

public class Context {
	
	private Strategy strategy;
	
	public Double calRecharge(Double charge,Integer type) {
		strategy = StrategyFactory.getInstance().creator(type);
		return strategy.calRecharge(charge);
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}
