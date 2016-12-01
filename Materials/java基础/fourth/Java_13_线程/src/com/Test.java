package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 开启一个子线程
		MyThread myThread = new MyThread(10);
		myThread.start(); // 运行子线程，系统调用run方法
		// myThread.run(); //调用对象中的方法，还是运行在主线程中

		MyThread t_02 = new MyThread(50);
//		//设定线程优先级，该线程抢占cpu的资源概率比其它线程略高。
//		t_02.setPriority(Thread.MAX_PRIORITY); 
		
		t_02.start();
		
		// 输出当前线程的名字
		System.out.println(Thread.currentThread().getName());

	}

}
