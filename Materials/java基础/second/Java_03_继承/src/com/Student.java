package com;

/**
 * @author Administrator ����Student�̳��˸���People�� Student��ӵ����People���е��������Ժͷ�����
 */
public class Student extends People {

	private int id;

	public Student(int id, String name, int age) {
		super(name, age); // ���ø���Ĺ��췽��
		this.id = id;  //���ʵ�ǰ�����е�����id
		super.id = 10; //���ʸ����е�����id
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void startClass() {
		System.out.println("�Ͽ�");
	}

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		super.doSomeThing();   //���ø����е�doSomeThing����
		System.out.println("����");
	}

	public void endClass() {
		System.out.println("�¿�");
	}
}
