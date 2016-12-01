package hqyj;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread_01().start();
		MyThread_02 thread_2 = new MyThread_02();
		thread_2.setDaemon(true); //将thread_2设置为后台线程
		thread_2.start();
		
		//GC垃圾回收机制。JVM虚拟机开启一个后台线程，专门用来检测回收内存。
	}

}
