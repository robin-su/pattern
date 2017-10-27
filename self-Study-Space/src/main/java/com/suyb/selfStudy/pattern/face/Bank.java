package com.suyb.selfStudy.pattern.face;

//银行
public interface Bank {
	void openAccount();//开户
}

class Icbc implements Bank {
	@Override
	public void openAccount() {
		System.out.println("在中国工商银行开户！");
	}
}