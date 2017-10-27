package com.suyb.selfStudy.pattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下5种创建单例模式的效率
 * 
 */
public class PerformanceClient {

	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		
		//启动线程计数器，不然main主线程不会等待其他线程执行完自己就执行下去了，这样的出来的数据是不对的
		int threadNum = 10;
		
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		
		for(int i = 0;i < threadNum; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i = 0;i < 100000;i++) {
//						Object o = HungryManSingleton.getInstance(); //10
//						Object o = LazySingleton.getInstance();//56
//						Object o = DoubleCheckLockSingleton.getInstance();//11
//						Object o = StaticInnerClassSingleton.getInstance();//12
//						Object o = EnumClassSingleton.INSTANCE;//7
					}
					//每次线程执行完就减1，注意这里内部类里面，不能直接使用外部的局部变量
					countDownLatch.countDown();
				}
			}).start();
		}	
		
		
		countDownLatch.await();//主线程要等待，其实就是一个循环检测，直到计数器变为0，才会继续往下执行
		
		long end = System.currentTimeMillis();
		
		System.out.println("总耗时：" + (end - start));//10
		
	}

}
