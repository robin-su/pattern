package com.suyb.selfStudy.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Package: Singleton
 * @Project: self-Study-Space
 * @Author: Suyb
 * @Description:懒汉式(如何防止反射和反序列化漏洞)
 * @Date: Create in 15:15 2017/10/23
 * @Modified By: robin
 */
public class CrackLazySingleton implements Serializable{


    private static CrackLazySingleton lazySingleton;

    private CrackLazySingleton() {
    	if(lazySingleton != null) { //第一次调用的时候，是正常的构建，第二次调的时候已经不为空了,防止反射漏洞
    		throw new RuntimeException(); 
    	}
    }

 
    public static synchronized CrackLazySingleton getInstance() {
        if(lazySingleton == null ) { // 第一次调用的时候，lazySingleton是空的，所以要new一个
            lazySingleton = new CrackLazySingleton();
        }
        return lazySingleton; //第二次调用的时候lazySingleton不是空的直接返回，这样可以保证类的唯一性
    }
    
    /**
     * 反序列化时，若反序列化的类已经定义了readResolve这个方法了，在反序列化的时候就直接调用
     * 这个类的readResolve这个方法，直接将对象返回，而不需要再重新构造一个新的对象
     */
    private Object readResolve() throws ObjectStreamException {
    	return lazySingleton;
    }

}

