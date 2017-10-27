package com.suyb.selfStudy.pattern.flyWeight;

/**
 * 抽象享元类：
 * 声明公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态。
 */
public interface ChessFlyWeight {
	
	String getColor();
	
	void display(Coordinate c);//显示棋子
	
}

/**
 * 具体的享元类:
 * 为内部状态提供成员变量进行存储（color）
 */
 class ConcreteChess implements ChessFlyWeight {
	 
	private String color;//内部状态
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色：" + color);
		System.out.println("其子位置：" + c.getX() + "---" + c.getY());
	}
	 
 }
