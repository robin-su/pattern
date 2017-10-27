package com.suyb.selfStudy.pattern.singleton;


/**
 * @Package: Singleton
 * @Project: self-Study-Space
 * @Author: Suyb
 * @Description:静态内部类实现单例模式
 * @Date: Create in 15:53 2017/10/23
 * @Modified By: robin
 */
public class StaticInnerClassSingleton {

    /**
     *  静态内部类的方式，集合了线程安全，调用效率，有懒加载的优点
     *
     *  懒加载：当我们加载StaticInnerClassSingleton的时候并不会立即初始化他的静态内部类StaticInnerClassInstance，
     *          只有在调用StaticInnerClassInstance.instance的时候，才会去加载和初始化静态内部类StaticInnerClassInstance
     *
     *  线程安全：因为类加载过程是天然的线程安全的，所以加载StaticInnerClassInstance也是线程安全的，而且我们将
     *           StaticInnerClassSingleton 定义成只读的，不管是谁都不能修改他，其实这个加不加无所谓的，因为类
     *           的加载已经保证了线程安全
     *
     *  调用效率高：不需要同步等待，调用效率高
     *
     *  目前狠毒哦开发框架都会使用这种方式。
     */
    private static class StaticInnerClassInstance {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassInstance.instance;
    }

    private StaticInnerClassSingleton() {
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton instance1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 =StaticInnerClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
