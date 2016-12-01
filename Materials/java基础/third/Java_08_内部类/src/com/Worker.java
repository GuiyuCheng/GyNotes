package com;

import com.Student.BirthDay;

public class Worker {
	private int id;
	private String name;
	private BirthDay birth;
	
	public static void main(String[] args) {
		Worker worker = new Worker();
	}
	
	public Worker() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "jack";
		//使用匿名内部类创建对象
		//定义一个没有名字的类（匿名类）继承了BirthDay。创建了一个匿名类对象。
		birth = new BirthDay(){
			int a;
			{
				System.out.println(a);
			};
			void getName(){
				name = "Ivy";
			}
			
			void getId(){
				System.out.println("id = " + id);
			}
		};
		
		//创建一个匿名的内部类对象。该匿名类实现了InterA接口。
		InterA a = new InterA(){
			@Override
			public void a() {
				// TODO Auto-generated method stub
				System.out.println("aaaa");
			}
		};
	}
	
	interface InterA{
		public void a();
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
