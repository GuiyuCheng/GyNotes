package hqyj;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread_01().start();
		MyThread_02 thread_2 = new MyThread_02();
		thread_2.setDaemon(true); //��thread_2����Ϊ��̨�߳�
		thread_2.start();
		
		//GC�������ջ��ơ�JVM���������һ����̨�̣߳�ר�������������ڴ档
	}

}
