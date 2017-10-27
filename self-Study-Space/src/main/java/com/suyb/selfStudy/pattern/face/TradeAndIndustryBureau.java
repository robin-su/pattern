package com.suyb.selfStudy.pattern.face;

/**
 *  工商局
 */
public interface TradeAndIndustryBureau {
	void checkName();
	
}

class HaiDingTradeAndIndustryBureau implements TradeAndIndustryBureau{

	@Override
	public void checkName() {
		System.out.println("检查名字是否有冲突");
	}
	
}
