package com.suyb.selfStudy.pattern.command;

/**
 * 命令的调用者和发起者
 */
public class Invoke {
	
	private Command command;//可以是一条，也可以是多条List<Command>,数据库底层事务管理就是类似的结构

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//业务方法，用于调用命令类的方法
	public void call() {
		command.execute(); //若是List的话，可以做拼接批处理
	}

}
