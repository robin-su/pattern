package com.suyb.selfStudy.pattern.enumStrategy;

public class JD implements Strategy {

	@Override
	public Double calRecharge(Double charge) {
		return charge * 0.01;
	}

}
