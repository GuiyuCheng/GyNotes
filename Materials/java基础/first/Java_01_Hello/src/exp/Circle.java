package exp;

public class Circle {
	
	int r;
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	
	
	public static void main(String[] args) {
		Circle c_01 = new Circle(100);
		Circle c_02 = new Circle(50);
		System.out.println(c_01.r + " " + c_02.r); // 100, 50
		swap(c_01, c_02);
		System.out.println(c_01.r + " " + c_02.r); // 50, 100
		
		
	}
	
	//����������: ��ͬһ�����У�������һ���������б�һ��
	
	//��ֵ
	public static void swap(int c_01, int c_02){
		int temp = c_01;
		c_01 = c_02;
		c_02 = temp;
	}
	
	//������
	public static void swap(Circle c_01, Circle c_02){
		int temp = c_01.r;
		c_01.r = c_02.r;
		c_02.r = temp;
		
	}
}
