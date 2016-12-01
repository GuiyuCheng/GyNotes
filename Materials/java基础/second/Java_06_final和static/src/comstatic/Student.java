package comstatic;

public class Student {
	
	private int id;
	
	static {
		System.out.println("运行静态语句块");
	}
	
	//静态变量也称为类属性
	//静态变量通过类名访问
	public static int number;
	
	public Student(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		number++;
	}
	
	//通过类名调用
	//静态方法也称为类方法
	public static int getNumber(){
		return 10;
	}
}
