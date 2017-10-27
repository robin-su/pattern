package com.suyb.selfStudy.pattern.prototype;

import java.util.Date;

/**
 * 深克隆
 */
public class Sheep2 implements Cloneable{
	
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone(); //其本质是调用Object中的clone方法，
		
		//添加如下代码实现深克隆（deep clone）
		Sheep2 s = (Sheep2)obj;
		s.birthday = (Date) this.birthday.clone(); //将属性也进行克隆
		return obj;
	}
	
	public Sheep2(String name, Date birthday) {
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
