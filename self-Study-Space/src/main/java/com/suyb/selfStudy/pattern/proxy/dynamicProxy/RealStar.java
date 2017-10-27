package com.suyb.selfStudy.pattern.proxy.dynamicProxy;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void sing() {
		System.out.println("RealStar(周杰伦).sing()");
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

}