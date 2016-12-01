package cn;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Photo p = new Photo();
		Printer r = new Printer();

		work(p);
		work(r);

	}

	public static void work(Usb usb) {
		usb.start();
		System.out.println("¹¤×÷ÖÐ");
		usb.end();
	}

}
