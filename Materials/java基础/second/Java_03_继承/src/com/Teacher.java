package com;

public class Teacher extends People {
	private int id;

	public Teacher(int id, String name, int age) {
		super(name, age);
		this.id = id;
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
		System.out.println("����ҵ");
	}

	public void endClass() {
		System.out.println("�¿�");
	}
}
