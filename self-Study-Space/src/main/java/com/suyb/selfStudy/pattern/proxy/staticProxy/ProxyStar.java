package com.suyb.selfStudy.pattern.proxy.staticProxy;

public class ProxyStar implements Star {
	
	private Star star;
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {//代理人什么都可以干，除了唱歌
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

}
