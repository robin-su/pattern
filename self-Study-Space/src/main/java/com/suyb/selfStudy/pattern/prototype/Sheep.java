package com.suyb.selfStudy.pattern.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 *   浅克隆
 */
public class Sheep implements Cloneable,Serializable{
	
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone(); //其本质是调用Object中的clone方法，
		return obj;
	}
	
	public Sheep(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}  
	
}
