package com;

/**
 * @author Administrator
 * Java�������ں�����ʼ����
 */
public class Hello {
	
	int a;
	
	
	public static void main(String args[]){
		//syso + Alt + ?
		System.out.println("Hello, java");
		;;;
		  
		//ctrl + s
		
		//new Student()  ���������ڶ��Ͽ����ڴ棬���ù��췽��
		//Student ��������
		//s_01    ����������������ã����
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
	    //�ַ������ӷ�+
	    System.out.println("hello java a = "+a+"b = " + b);
	    
	    //4.8Ĭ����double����
	    //4.8f  float����
	    Phone p_01 = new Phone("����", "note3", 3000, 4.8f);
	    Phone p_02 = new Phone("ƻ��", "6", 5200, 5.0f);
	    Phone p_03 = new Phone("HTC", "One", 3000, 4.8f);
	    
	    Phone p_04 = new Phone();
	    Phone p_05 = new Phone();
	    Phone p_06 = new Phone();
	    p_04.call();
	    p_05.call();
	    p_06.call();
	    
	    p_02.call();
	    
	    //����.��Ϊ
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
	    	System.out.println("a_01��С" + is_01);
	    }
		System.out.println("\"���\"");
		System.out.println("a\tbccc\tuuu\t");
		System.out.println("abc\tbccc\tu\t");
		
		//java�ַ�����unicode���룬ռ�����ֽڣ����Լ������ġ�
		int i_01 = 87;
		char c_01 = (char)i_01;
		System.out.println("c_01 = " + c_01);
		char c_02 = '��';
		int i_02 = c_02;
		System.out.println(i_02);
		
		//����һ�������������͵Ŀռ䣬��û�д�������
		Student ss_01 = null;
		
	}
}
