package com;

/**
 * @author Administrator
 * Java程序从入口函数开始运行
 */
public class Hello {
	
	int a;
	
	
	public static void main(String args[]){
		//syso + Alt + ?
		System.out.println("Hello, java");
		;;;
		  
		//ctrl + s
		
		//new Student()  创建对象，在堆上开辟内存，调用构造方法
		//Student 对象类型
		//s_01    对象名，对象的引用，句柄
		Student s_01 = new Student(10, "jack", 100);
		s_01.getId();
		s_01.getName();
//		s_01.id = 10;
		
		
		Student s_02 = new Student(11, "Ivy", 100);
		s_02.getId();
		s_02.getName();
		
		System.out.println(s_01);
		System.out.println(s_02);
		
	    Hello hello = new Hello();
	    hello.a = 10;
	    System.out.println(hello.a);
	    
	    int a = 10;
	    int b = 12;
	    //字符串连接符+
	    System.out.println("hello java a = "+a+"b = " + b);
	    
	    //4.8默认是double类型
	    //4.8f  float类型
	    Phone p_01 = new Phone("三星", "note3", 3000, 4.8f);
	    Phone p_02 = new Phone("苹果", "6", 5200, 5.0f);
	    Phone p_03 = new Phone("HTC", "One", 3000, 4.8f);
	    
	    Phone p_04 = new Phone();
	    Phone p_05 = new Phone();
	    Phone p_06 = new Phone();
	    p_04.call();
	    p_05.call();
	    p_06.call();
	    
	    p_02.call();
	    
	    //对象.行为
	    new Phone().web();
	    new Phone().web();
	    //
	    Phone p_07 = new Phone();
	    p_07.web();
	    p_07.web();
	    
	    p_07.setWeight(1000);
	    System.out.println(p_07.getWeight());
	    
	    boolean is = true;
		if(is){
			System.out.println(is);
		}
	    int a_01 = 10, a_02 = 12;
	    double r_01 = a_02/a_01*1.0;
	    System.out.println("r_01 = " + r_01);
	    
	    boolean is_01 = a_01 < a_02;
	    if(a_01 < a_02){
	    	System.out.println("a_01较小" + is_01);
	    }
		System.out.println("\"你好\"");
		System.out.println("a\tbccc\tuuu\t");
		System.out.println("abc\tbccc\tu\t");
		
		//java字符采用unicode编码，占两个字节，可以兼容中文。
		int i_01 = 87;
		char c_01 = (char)i_01;
		System.out.println("c_01 = " + c_01);
		char c_02 = '您';
		int i_02 = c_02;
		System.out.println(i_02);
		
		//声明一个引用数据类型的空间，并没有创建对象
		Student ss_01 = null;
		
	}
}
