package exp;

public class Circle extends Shape{
	
	{
		System.out.println("ִ��Circle���е�����");
	}
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		super(r);
		System.out.println("ִ��Circle����");
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*s_01*s_01;
	}
}
