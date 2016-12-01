package cn;

public class MyRunnable implements Runnable {
	private int ticketNumber = 10;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (ticketNumber > 0) {
			synchronized (this) {
				if(ticketNumber > 0){
					System.out.println(Thread.currentThread().getName() + "出售第"
							+ ticketNumber + "张票");
					ticketNumber--;
				}
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
