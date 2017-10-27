package com.suyb.selfStudy.pattern.adapter;

/**
 *  适配器(两种方式：继承被适配的类-类适配器)
 *  （相当于usb和ps/2的转接器）
 */
public class Adpater extends Adaptee implements Target{ 

	@Override
	public void handleReq() {
		super.request();
	}

}
