package comstatic;

public class Student {
	
	private int id;
	
	static {
		System.out.println("���о�̬����");
	}
	
	//��̬����Ҳ��Ϊ������
	//��̬����ͨ����������
	public static int number;
	
	public Student(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		number++;
	}
	
	//ͨ����������
	//��̬����Ҳ��Ϊ�෽��
	public static int getNumber(){
		return 10;
	}
}
