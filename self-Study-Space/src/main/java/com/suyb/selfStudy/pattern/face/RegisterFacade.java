package com.suyb.selfStudy.pattern.face;

/**
 * 办理注册公司流程的门面对象
 */
public class RegisterFacade {
	
	public void register() {
		TradeAndIndustryBureau ttb = new HaiDingTradeAndIndustryBureau();
		ttb.checkName();
		QualityInspectionBureau qib = new HaiDingQualityInspectionBureau();
		qib.orgCodeCertificate();
		InlandRevenueDepartment ird = new HaiDingInlandRevenueDepartment();
		ird.taxCertificate();
		Bank bank = new Icbc();
		bank.openAccount();
	}
	

}
