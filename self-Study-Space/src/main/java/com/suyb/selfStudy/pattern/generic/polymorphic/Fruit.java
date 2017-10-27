package com.suyb.selfStudy.pattern.generic.polymorphic;

/**
 * 继承链
 * 		Object
 * 		  |
 *      Fruit
 *      /  \
 *  Apple  Pear
 *    | 
 * FujiApple
 */
public class Fruit {

}

class Apple extends Fruit {
	
}

class Pear extends Fruit {
	
}

class FujiApple extends Apple {
	
}