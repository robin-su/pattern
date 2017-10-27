package com.suyb.selfStudy.pattern.generic;

/**
 * 泛型接口
 * 泛型只能用在公共的抽象方法上面，不能用在全局常量上面
 */
public interface Comparator<T> {
	
	//全局常量
	/*public static final  可以省略*/ int MAX_VALUE = 1024;
	
	//公共的抽象方法
	/*public abstract 可以省略*/T compare(T t);

}
