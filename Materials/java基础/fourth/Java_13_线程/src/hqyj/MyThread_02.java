package hqyj;

public class MyThread_02 extends Thread {
	public static boolean is = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(is){
			System.out.println(Thread.currentThread().getName() + "running");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
