package com.suyb.selfStudy.pattern.enumStrategy;

public enum RechargeTypeEnum {

	JD(1, "京东"), BESTPAY(2, "易支付"), WECHART(3, "微信"), ALIPAY(4, "支付宝");

	private int value;
	private String description;

	private RechargeTypeEnum() {
	}

	private RechargeTypeEnum(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static RechargeTypeEnum valueOf(int value) {
		for(RechargeTypeEnum typeEnum : RechargeTypeEnum.values()) {
			if(typeEnum.getValue() == value) {
				return typeEnum;
			}
		}
		return null;
	}

}
