package com;

/**
 * ��Student
 */
public class Student {
	
	//��Ա����������
	private int id;
	private String name;
	private int score;
	
	//��ʼ�����Եķ���
	//���췽��
	//ע�⣺1.ȱʡ����ֵ��2.������������һ��
	public Student(int _id, String _name, int _score){
		id = _id;
		name = _name;
		score = _score;
	}
	
	
	//��Ա��������Ϊ
	public String getName(){
		
		System.out.println(name);
		return name;
	}
	
	public int getId(){
		System.out.println(id);
		return id;
	}
}
