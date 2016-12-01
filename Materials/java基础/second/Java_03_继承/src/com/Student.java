package com;

/**
 * @author Administrator 子类Student继承了父类People。 Student类拥有了People类中的所有属性和方法。
 */
public class Student extends People {

	private int id;

	public Student(int id, String name, int age) {
		super(name, age); // 调用父类的构造方法
		this.id = id;  //访问当前子类中的属性id
		super.id = 10; //访问父类中的属性id
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void startClass() {
		System.out.println("上课");
	}

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		super.doSomeThing();   //调用父类中的doSomeThing方法
		System.out.println("考试");
	}

	public void endClass() {
		System.out.println("下课");
	}
}
