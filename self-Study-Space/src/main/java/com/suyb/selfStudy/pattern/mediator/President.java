package com.suyb.selfStudy.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {
	
	private Map<String,Department> maps = new HashMap<String,Department>();

	@Override
	public void command(String dname) {
		maps.get(dname).selfAction();
	}

	@Override
	public void register(String dname, Department d) {
		maps.put(dname, d);
	}
	

}
