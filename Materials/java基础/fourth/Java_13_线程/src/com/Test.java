package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һ�����߳�
		MyThread myThread = new MyThread(10);
		myThread.start(); // �������̣߳�ϵͳ����run����
		// myThread.run(); //���ö����еķ������������������߳���

		MyThread t_02 = new MyThread(50);
//		//�趨�߳����ȼ������߳���ռcpu����Դ���ʱ������߳��Ըߡ�
//		t_02.setPriority(Thread.MAX_PRIORITY); 
		
		t_02.start();
		
		// �����ǰ�̵߳�����
		System.out.println(Thread.currentThread().getName());

	}

}
