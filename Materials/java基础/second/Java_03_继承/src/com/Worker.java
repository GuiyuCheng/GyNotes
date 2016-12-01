package com;

public class Worker extends People {
	private int id;

	public Worker(int id, String name, int age) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void startWork() {
		System.out.println("����");
	}

	public void endWork() {
		System.out.println("�չ�");
	}

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
}
