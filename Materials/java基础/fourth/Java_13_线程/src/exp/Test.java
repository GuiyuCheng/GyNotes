package exp;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new MyRun());
		thread.start();
		
		//��ϰ�����߳�ģ�ⴰ������Ʊ
		//��10�Ż�Ʊ�����������ڡ���ӡ�������Ʊ�Ĺ��̡�
		//����0����10�Ż�Ʊ
		//����2����9�Ż�Ʊ
		//����1����8�Ż�Ʊ
		//...
		//����1����1�Ż�Ʊ
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
