package com.suyb.selfStudy.pattern.memento;

public class Client {

	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("高淇", 18, 900);
		System.out.println("第一次打印对象："	+ emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
		
		taker.setMemento(emp.memento());//备份一次
		
		emp.setAge(38);
		emp.setEname("高崎");
		emp.setSalary(9000);
		
		System.out.println("第二次打印对象："	+ emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
		
		//恢复到备忘录对象保存的状态
		emp.recovery(taker.getMemento());
		System.out.println("第三次打印对象："	+ emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
		
	}

}
