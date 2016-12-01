package comstatic;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s_01 = new Student(1);
		Student s_02 = new Student(2);
		Student s_03 = new Student(3);
		Student s_04 = new Student(4);
		Student s_05 = new Student(4);
		Student s_06 = new Student(4);
		
		//统计当前学生对象的数量
		System.out.println(Student.number);
		
		Student.getNumber();
	}

}
