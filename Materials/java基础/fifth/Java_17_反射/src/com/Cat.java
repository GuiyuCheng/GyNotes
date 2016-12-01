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
		color = "黄色";
		age = 5;
	}
	
	private Cat(){
		name = "波斯猫";
		color = "白色";
		age = 1;
	}
	
	public void display(){
		System.out.println(name + color + age);
	}
	
	public void eat(int count){
		System.out.println(this.name + "吃了" + count + "条鱼");
		
	}
	
	private void sleep(){
		System.out.println(this.name + "睡午觉");
	}

	
	
}
