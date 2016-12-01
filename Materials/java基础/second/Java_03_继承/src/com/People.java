package com;

public class People {
	protected String name;
	protected int age;
	protected int id;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("³Ô·¹");
	}

	public void sleep() {
		System.out.println("Ë¯¾õ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	protected void doSomeThing(){
		System.out.println("people do something");
		
	}
}
