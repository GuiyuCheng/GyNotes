package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个学生类：属性：学号，姓名，年龄
		//		            行为:上课，考试，下课，吃饭，睡觉
		//定义一个工人类：属性：工号，姓名，年龄
		//          行为：开工，验收，放工，吃饭，睡觉
		//定义一个教师类：属性：编号，姓名，年龄
		//          行为：上课，改作业，下课，吃饭，睡觉
		
		//测试类中分别创建出一个学生对象，一个工人对象，一个教师对象。并且执行他们的日常行为。
		
		Student student = new Student(111, "学生1", 15);
		Worker worker = new Worker(1111, "工人1", 40);
		Teacher teacher = new Teacher(11, "教师1", 30);
		
		student.eat();
		student.sleep();
		worker.eat();
		worker.sleep();
		teacher.eat();
		teacher.sleep();
		
		//打印输出矩形的面积，圆形的面积，等边三角形的面积
		//矩形类：宽和高，求面积
		//圆形类：半径，求面积 Math.PI
		//等边三角形：边长，求面积 Math.sin
		
		//父类：边长1，边长2，求面积
		
	}

}
