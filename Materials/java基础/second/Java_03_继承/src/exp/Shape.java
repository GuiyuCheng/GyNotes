package exp;

public class Shape {
	protected int s_01, s_02;
	
	//重载构造方法
	public Shape(int s_01, int s_02) {
		// TODO Auto-generated constructor stub
		this.s_01 = s_01;
		this.s_02 = s_02;
	}
	
	public Shape(int r) {
		// TODO Auto-generated constructor stub
		this.s_01 = r;
		this.s_02 = r;
	}
	
	public double getArea(){
		
		return 0;
	}
}
