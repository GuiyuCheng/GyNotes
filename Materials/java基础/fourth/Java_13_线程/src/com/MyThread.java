package com;

public class MyThread extends Thread {

	int count;

	int sleepTime;
	
	public MyThread(int sleepTime) {
		// TODO Auto-generated constructor stub
		this.sleepTime = sleepTime;
	}
	
	// �߳���
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (count < 5) {
			System.out.println(sleepTime + Thread.currentThread().getName() + "����:"+ count);
			count++;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // ����һ�룬�Ժ���Ϊ��λ
		}
		
	}
}
