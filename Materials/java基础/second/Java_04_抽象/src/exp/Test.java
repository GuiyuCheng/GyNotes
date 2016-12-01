package exp;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		System.out.println(c.getArea());
		
		Rect r = new Rect(10, 10);
		System.out.println(r.getArea());
		
		Thiangle t = new Thiangle(10);
		System.out.println(t.getArea());
		
		//抽象类不能创建对象
//		Shape shape = new Shape(2);
//		shape.getArea();
	}

}
