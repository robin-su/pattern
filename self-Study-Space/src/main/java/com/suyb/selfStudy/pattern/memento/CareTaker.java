package com.suyb.selfStudy.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 管理备忘录对象
 */
public class CareTaker {
	
	private EmpMemento memento;
	
//	private List<EmpMemento> list = new ArrayList<EmpMemento>();可以加很多备忘点
	

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	
}
