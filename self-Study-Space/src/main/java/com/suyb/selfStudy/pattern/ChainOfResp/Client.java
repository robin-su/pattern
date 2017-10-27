package com.suyb.selfStudy.pattern.ChainOfResp;

public class Client {

	public static void main(String[] args) {
		Leader a = new Director("张三");
		Leader b = new Manager("李四");
		Leader d = new ViceGeneralManager("李小四");
		Leader c = new GeneralManager("王五");
		
		//组织责任链对象的关系  --- 我们设置可以将这种组织关系写到配置文件中，通过反射进行处理XML
		a.setNextLeader(b);
		b.setNextLeader(d);
		d.setNextLeader(c);
		
		//开始请假操作
		LeaveRequest req1 = new LeaveRequest("TOM", 15, "回英国老家探亲");
		a.handleRequest(req1);
	}
 
}
