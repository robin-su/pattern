package com.suyb.selfStudy.pattern.generic.extend;

/**
 * 泛型父类，子类为富二代（子类的泛型只能比泛型父类多，而不能少）
 * 1.保留父类的泛型 --> 子类是泛型子类
 * 2.不保留父类泛型 --> 之类按需实现（可以是泛型类，也可以是非泛型类）
 * 
 * 属性及方法类型  --> 随位置而定
 * 1）
 * 子类重写方法的类型 --> 随父类而定
 * 子类新增方法的类型 --> 随子类而定
 * 
 * 2）
 * 子类中使用父类的属性 --> 随父类而定
 * 子类中使用自己的属性 --> 随子类而定
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}

//保留 --> 泛型子类
//1).全部保留
class C1<T1,T2> extends Father<T1,T2> {
	
	@Override
	public void test(T2 name) {
//		this.age; --> T1
	}
	
}

class C11<T1,T2,A,B> extends Father<T1,T2>{
	
	A sex;

	@Override
	public void test(T2 name) {
		
	}
}

//2).部分保留
class C2<T2> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
//		this.age; --> Integer
	}
}

class C21<T2,A,B> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}
}

//不保留 --> 按需实现
//1) 指定具体类型
class C3 extends Father<Integer,String> {

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
//		this.age; --> Integer
	}
	
}

class C31<A,B> extends Father<Integer,String> {

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}
}
//2) 没有类型  擦除  Object
class C4 extends Father{//当你不指定的时候就类似写了<Object,Object>

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
//		this.age; --> Object
		
	} 
}

class C41<A,B> extends Father{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	} //当你不指定的时候就类似写了<Object,Object>
}