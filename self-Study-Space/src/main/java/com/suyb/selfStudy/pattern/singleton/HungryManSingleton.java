package com.suyb.selfStudy.pattern.singleton;

/**
 * @Package: Singleton
 * @Project: self-Study-Space
 * @Author: Suyb
 * @Description:测试饿汉式单例
 * @Date: Create in 14:55 2017/10/23
 * @Modified By: robin
 */
public class HungryManSingleton {

    /**
     * 当类加载器加载这个类的时候，加载的时候就把这个类的对象new出来（static初始化较前），无论你要不要，我都加载（立即加载）
     * 缺点：这个有个缺点，也许你马上加载了这个类，但是我压根就没用到这个类，那你不就白加载了吗，浪费资源？所以我们希望有一个延迟加载的方式i，
     * 就是不马上加载，当我们使用的时候再加载（懒加载），这将在我们使用懒汉式的时候使用
     *
     * 优点：由于类加载器在加载类的时候，是天然的线程安全模式，也就是说在new HungryManSingleton()初始化的时候，他不存在
     * 在多个进程之间出现问题，所以他是天然的线程安全的
     */
    private static HungryManSingleton hugryManSingleton = new HungryManSingleton();

    private HungryManSingleton() {
    }

    /**
     * 因为线程安全。所以这里不需要添加同步锁sychronized,所以调用效率高
     */
    public static HungryManSingleton getInstance() {
        return hugryManSingleton;
    }

    public static void main(String[] args) {
        HungryManSingleton instance1 = HungryManSingleton.getInstance();
        HungryManSingleton instance2 = HungryManSingleton.getInstance();
        System.out.println(instance1 == instance1);
    }

}
