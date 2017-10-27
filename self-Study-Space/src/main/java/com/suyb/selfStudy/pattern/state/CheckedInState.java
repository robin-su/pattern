package com.suyb.selfStudy.pattern.state;

/**
 * 已入住的状态
 */
public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已经入住！请勿打扰！");
	}

}
