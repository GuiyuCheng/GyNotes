package exp;

public class Circle extends Shape{
	
	{
		System.out.println("执行Circle类中的语句块");
	}
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		super(r);
		System.out.println("执行Circle构造");
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*s_01*s_01;
	}
}
