package com;

public class Student {
	private int id;
	private String name;
	private BirthDay birth;

	public Student() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "jack";
		//ʹ���ڲ��ഴ������
		birth = new BirthDay(); 
	}
	
	// �ڲ���
	class BirthDay {
		int year;
		int month;
		int day;

		void getId() {
			//���ڲ����п��Է��ʵ�ǰ������г�Ա������˽�У�
			id = 10;
		}
	}
}
