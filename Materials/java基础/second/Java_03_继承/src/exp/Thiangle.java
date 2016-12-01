package exp;

public class Thiangle extends Shape {

	public Thiangle(int s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return s_01*Math.sin(Math.PI/3)*s_01/2;
	}
}
