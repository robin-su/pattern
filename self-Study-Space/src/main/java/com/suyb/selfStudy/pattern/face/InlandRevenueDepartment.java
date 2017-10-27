package com.suyb.selfStudy.pattern.face;

//税务局
public interface InlandRevenueDepartment {
	void taxCertificate();//办理税务登记证
}

class HaiDingInlandRevenueDepartment implements InlandRevenueDepartment {

	@Override
	public void taxCertificate() {
		System.out.println("在还定税务局办理税务登记证！");
		
	}
	
}