package exp;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new MyRun());
		thread.start();
		
		//练习：用线程模拟窗口卖火车票
		//有10张火车票，有三个窗口。打印输出卖火车票的过程。
		//窗口0卖第10张火车票
		//窗口2卖第9张火车票
		//窗口1卖第8张火车票
		//...
		//窗口1卖第1张火车票
	}
	
	
////	class Thread{
//			 Runnable runnable;
//	         public Thread(Runnable runnable){
//			 	this.runnable = runnable;
//	         }  
//			 public void run{
//	         	if(runnable != null){
//					runnable.run();
//	   			}
//	         }
//      }
////	
}
