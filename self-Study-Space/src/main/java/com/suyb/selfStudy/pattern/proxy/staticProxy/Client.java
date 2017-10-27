package com.suyb.selfStudy.pattern.proxy.staticProxy;

public class Client {
	
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.signContract();
		proxy.sing();
		proxy.collectMoney();
		
		/**
		 *  ProxyStar.confer()
			ProxyStar.signContract()
			ProxyStar.bookTicket()
			ProxyStar.signContract()
			RealStar(周杰伦).sing()
			ProxyStar.collectMoney()
		 */
	}
	
}
