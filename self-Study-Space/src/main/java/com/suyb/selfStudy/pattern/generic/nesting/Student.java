package com.suyb.selfStudy.pattern.generic.nesting;

public class Student<T> {
	
	private T score;

	public T getScore() {
		return score;
	}

	public void setScore(T score) {
		this.score = score;
	}

}
