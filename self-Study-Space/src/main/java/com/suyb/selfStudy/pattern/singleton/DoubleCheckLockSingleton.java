package com.suyb.selfStudy.pattern.singleton;

/**
 * @Package: Singleton
 * @Project: self-Study-Space
 * @Author: Suyb
 * @Description:双重检测加锁
 * @Date: Create in 15:33 2017/10/23
 * @Modified By: robin
 */
public class DoubleCheckLockSingleton {

    private static DoubleCheckLockSingleton instance = null;

    /**
     * 由于编译器优化原因和JVM底层内部模型原因，偶尔会出问题，不建议使用。
     *
     * 我们在懒汉式的时候，在getInstance方法前面加了一个synchronized，这样
     * 只要线程调用getInstance的时候，都要进行等待，整个方法进行了同步，这样
     * 效率非常低。
     *
     * 双重检测加锁：将同步块更加细粒度，放到if下面，这样就提高了效率，不需要每次
     * 都同步，只有第一次的时候，即instance = null的时候才进行同步。不等空就直接返回
     *
     * 优点：即提高了调用效率，又有懒加载
     */
    public static DoubleCheckLockSingleton getInstance() {
        if(instance == null) {
            DoubleCheckLockSingleton dc;
            synchronized (DoubleCheckLockSingleton.class) {
                dc = instance;
                if(dc == null) {
                    synchronized(DoubleCheckLockSingleton.class) {
                        if(dc == null) {
                            dc = new DoubleCheckLockSingleton();
                        }
                    }
                    instance = dc;
                }
            }
        }
        return instance;
    }

    private DoubleCheckLockSingleton() {
    }

    public static void main(String[] args) {
        DoubleCheckLockSingleton instance1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton instance2 = DoubleCheckLockSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
