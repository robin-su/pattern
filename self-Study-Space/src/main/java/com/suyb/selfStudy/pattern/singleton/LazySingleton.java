package com.suyb.selfStudy.pattern.singleton;


/**
 * @Package: Singleton
 * @Project: self-Study-Space
 * @Author: Suyb
 * @Description:懒汉式
 * @Date: Create in 15:15 2017/10/23
 * @Modified By: robin
 */
public class LazySingleton {

    /**
     * 类加载的时候不去创建对象，只有调用getInstance()方法的时候才会去创建对象
     * 这样提升的资源的利用率
     */
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    /**
     *  这个方法可能会有多个线程的调用，所以我要使用同步锁synchronized
     *  这样可以避免在并发高的时候创建多个对象,同时这样也引起了另外一个问题
     *  多个线程进行调用的时候，他要等待另一个线程调用完这个方法才能调用。
     *  这样调用效率就低下了
     */
    public static synchronized LazySingleton getInstance() {
        if(lazySingleton == null ) { // 第一次调用的时候，lazySingleton是空的，所以要new一个
            lazySingleton = new LazySingleton();
        }
        return lazySingleton; //第二次调用的时候lazySingleton不是空的直接返回，这样可以保证类的唯一性
    }

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}


/*
*   在实际工程当中，若创建一个对象的代价很高，则可以使用懒加载的方式，即使用懒汉式
*   如果，这个类被调用的很频繁，则建议使用饿汉式
* */
