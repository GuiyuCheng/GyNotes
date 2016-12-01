package com;

public class Student {
	private int id;
	private String name;
	private BirthDay birth;

	public Student() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "jack";
		//使用内部类创建对象
		birth = new BirthDay(); 
	}
	
	// 内部类
	class BirthDay {
		int year;
		int month;
		int day;

		void getId() {
			//在内部类中可以访问当前类的所有成员（包含私有）
			id = 10;
		}
	}
}
