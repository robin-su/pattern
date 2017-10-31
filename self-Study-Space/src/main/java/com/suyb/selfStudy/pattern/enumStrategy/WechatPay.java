package com.suyb.selfStudy.pattern.enumStrategy;

public class WechatPay implements Strategy {

	@Override
	public Double calRecharge(Double charge) {
		return charge * 0.8;
	}

}
