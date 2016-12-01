package hqyj;

public class MyThread_01 extends Thread {
	int count;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(count < 10){
			count++;
			System.out.println(Thread.currentThread().getName() + "runnning");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
