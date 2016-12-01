package cn;

public class Printer implements Usb {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机开始工作");
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		System.out.println("打印机结束工作");
	}

}
