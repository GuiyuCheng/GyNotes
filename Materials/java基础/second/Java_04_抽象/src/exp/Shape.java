package exp;

public abstract class Shape {
	
	protected int s_01, s_02;

	{
		System.out.println("ִ��Shape���е�����");
	}

	// ���ع��췽��
	public Shape(int s_01, int s_02) {
		// TODO Auto-generated constructor stub
		this.s_01 = s_01;
		this.s_02 = s_02;
	}

	public Shape(int r) {
		// TODO Auto-generated constructor stub
		this.s_01 = r;
		this.s_02 = r;
		System.out.println("ִ��Shape����");
	}

	//���󷽷�
	public abstract double getArea();
}
