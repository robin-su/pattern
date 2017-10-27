package com.suyb.selfStudy.pattern.singleton;

/**
 * @Package: Singleton
 * @Project: self-Study-Space
 * @Author: Suyb
 * @Description:使用枚举类来实现单例子
 * @Date: Create in 16:37 2017/10/23
 * @Modified By: robin
 */
public enum EnumClassSingleton {

    /**
     * 定义一个枚举元enum素，他就代表了Singleton的一个实例
     * enum类是天然单例的，INSTANCE就代表了单例对象
     * 优点：避免了反射和反序列化的漏洞，调用效率高
     * 缺点：没有懒加载的效果
     */
    INSTANCE;

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation() {
        System.out.println("I am a singleton");
    }

    public static void main(String[] args) {
        EnumClassSingleton instance1 = EnumClassSingleton.INSTANCE;
        EnumClassSingleton instance2 = EnumClassSingleton.INSTANCE;
        instance1.singletonOperation();
        System.out.println(instance1 == instance2);
    }
}
