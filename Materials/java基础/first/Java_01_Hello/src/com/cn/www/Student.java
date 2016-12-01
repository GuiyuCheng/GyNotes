package com.cn.www;

/**
 * alt + shift + j 文档注释
 * @author Administrator
 * 
 * 学生类，定义学生的信息：id,name,score
 */
public class Student {
	
	/**
	 * 学生id，每个id不能重复
	 */
	private int id;
	
	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 学生数学课程的分数
	 */
	private int score;
	
	/**
	 *  初始化属性
	 * @param _id    id号
	 * @param _name  姓名
	 * @param _score 分数
	 * 
	 *
	 */
	public Student(int _id, String _name, int _score){
		id = _id;
		name = _name;
		score = _score;
		
	}
	
	
	/**
	 * 获取当前学生对象的姓名
	 * @return 姓名
	 * 
	 * 
	 */
	public String getName(){
		
		System.out.println(name);
		return name;
	}
	
	/**
	 * 获取当前学生对象的id
	 * @return id
	 */
	public int getId(){
		System.out.println(id);
		
		return id;
	}
	
	/**
	 * 打印学生对象信息
	 */
	public void display(){
		System.out.println(id + name + score);
		
	}
}
