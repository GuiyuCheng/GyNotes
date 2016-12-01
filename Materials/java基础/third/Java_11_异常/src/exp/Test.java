package exp;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath math = new MyMath();
		try {
			math.add(-1);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("捕获 i==0 的异常");
		} catch (MyNagtiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //打印输出异常信息
			System.out.println("捕获 i<0 的异常");
		}
		
		
	}

}
