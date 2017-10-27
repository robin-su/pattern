package com.suyb.selfStudy.pattern.observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 *  消息订阅者
 */
public class ObserverA implements Observer {
	
	private int myState;

	@Override
	public void update(Observable o, Object arg) { //o就是发布者。
		myState = ((ConcreteSubject)o).getState();
	}

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}
	
}
