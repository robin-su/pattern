package com.suyb.selfStudy.pattern.strategy;

/**
 * 老客户小批量
 */
public class OldCustomerFewStrategy implements Strategy{
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打8.5折，原价！");
		return standardPrice * 0.85;
	}
}
