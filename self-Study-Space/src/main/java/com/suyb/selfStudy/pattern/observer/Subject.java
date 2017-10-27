package com.suyb.selfStudy.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> list = new ArrayList<Observer>();
	
	//注册新的观察者
	public void registerObject(Observer obs){ 
		list.add(obs);
	}
	
	public void removeObject(Observer obs) {
		list.remove(obs);
	}
	
	//通知所有的观察者更新动态
	public void notifyAllObject() {
		for (Observer obs : list) {
			obs.update(this);
		}
	}
	
}
