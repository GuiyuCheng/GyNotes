package com;

/**
 * 类Student
 */
public class Student {
	
	//成员变量，属性
	private int id;
	private String name;
	private int score;
	
	//初始化属性的方法
	//构造方法
	//注意：1.缺省返回值，2.构造名和类名一致
	public Student(int _id, String _name, int _score){
		id = _id;
		name = _name;
		score = _score;
	}
	
	
	//成员方法，行为
	public String getName(){
		
		System.out.println(name);
		return name;
	}
	
	public int getId(){
		System.out.println(id);
		return id;
	}
}
