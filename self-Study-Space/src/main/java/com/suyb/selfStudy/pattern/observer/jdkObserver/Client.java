package com.suyb.selfStudy.pattern.observer.jdkObserver;

public class Client {

	public static void main(String[] args) {
		//创建发布者
		ConcreteSubject subject = new ConcreteSubject();
		//创建观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//将上面三个观察者对象添加到目标对象subject的观察者的容器中
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		//改变subject对象状态
		subject.set(12);
		System.out.println("==============状态修改了");
		//看看观察者的状态发生了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}

}
