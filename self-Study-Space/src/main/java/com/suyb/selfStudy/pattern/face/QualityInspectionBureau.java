package com.suyb.selfStudy.pattern.face;

//质检局
public interface QualityInspectionBureau {
	void orgCodeCertificate(); //办理组织机构代码
}

class HaiDingQualityInspectionBureau implements QualityInspectionBureau {

	@Override
	public void orgCodeCertificate() {
		System.out.println("在还定质检局办理组织机构代码！");
		
	}
	
}
