package com.suyb.selfStudy.pattern.strategy;

/**
 * 普通客户大批量
 */
public class NewCustomerManyStrategy implements Strategy{
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打9折，原价！");
		return standardPrice * 0.9;
	}
}
