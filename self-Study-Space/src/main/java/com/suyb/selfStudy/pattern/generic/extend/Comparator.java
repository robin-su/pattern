package com.suyb.selfStudy.pattern.generic.extend;

/**
 * 泛型接口与泛型父类同理
 */
public interface Comparator<T> {
	//全局常量
	public static final int MAX_VALUE = 100;
	
	//公共的抽象方法
	public abstract void test(T t);
}

//实现
class InterC<A> implements Comparator{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}} //<Object>

class Interc2<A> implements Comparator<Integer> {

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}}

class Interc3<T,A> implements Comparator<T> {

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}}


