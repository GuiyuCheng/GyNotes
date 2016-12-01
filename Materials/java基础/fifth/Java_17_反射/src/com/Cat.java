package com;

public class Cat {
	private String name;
	private String color;
	private int age;
	
	public Cat(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Cat(String name) {
		super();
		this.name = name;
		color = "��ɫ";
		age = 5;
	}
	
	private Cat(){
		name = "��˹è";
		color = "��ɫ";
		age = 1;
	}
	
	public void display(){
		System.out.println(name + color + age);
	}
	
	public void eat(int count){
		System.out.println(this.name + "����" + count + "����");
		
	}
	
	private void sleep(){
		System.out.println(this.name + "˯���");
	}

	
	
}
