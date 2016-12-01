package cn;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable MyRun = new MyRunnable();
		
		new Thread(MyRun).start();
		new Thread(MyRun).start();
		new Thread(MyRun).start();
	}

}
