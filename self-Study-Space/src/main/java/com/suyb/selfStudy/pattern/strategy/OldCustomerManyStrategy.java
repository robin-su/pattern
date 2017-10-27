package com.suyb.selfStudy.pattern.strategy;

/**
 * 老客户大批量
 */
public class OldCustomerManyStrategy implements Strategy{
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打8折，原价！");
		return standardPrice * 0.8;
	}
}
