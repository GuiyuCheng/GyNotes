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
			System.out.println("���� i==0 ���쳣");
		} catch (MyNagtiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //��ӡ����쳣��Ϣ
			System.out.println("���� i<0 ���쳣");
		}
		
		
	}

}
